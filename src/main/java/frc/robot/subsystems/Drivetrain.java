package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * Subsystem for moving the robot around
 */
public class Drivetrain extends Subsystem {
  // The drive controller we're using
  private DifferentialDrive differentialDrive = null;

  public Drivetrain() {
    WPI_VictorSPX leftFrontVictorSPX = new WPI_VictorSPX(RobotMap.DRIVETRAIN_LEFT_FRONT_VICTORSPX);
    WPI_VictorSPX leftBackVictorSPX = new WPI_VictorSPX(RobotMap.DRIVETRAIN_LEFT_BACK_VICTORSPX);
    WPI_VictorSPX rightFrontVictorSPX = new WPI_VictorSPX(RobotMap.DRIVETRAIN_RIGHT_FRONT_VICTORSPX);
    WPI_VictorSPX rightBackVictorSPX = new WPI_VictorSPX(RobotMap.DRIVETRAIN_RIGHT_BACK_VICTORSPX);

    SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFrontVictorSPX, leftBackVictorSPX);
    SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFrontVictorSPX, rightBackVictorSPX);

    // leftMotors.setInverted(true);
    // rightMotors.setInverted(true);

    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
  }

    public void arcadeDrive(double moveSpeed, double rotateSpeed, boolean sprint) {
      if(!sprint) {
        moveSpeed = moveSpeed / 1.35;
        rotateSpeed = rotateSpeed / 1.5;
      }
      // Right now we seem to be BOTH using `setInverted` above AND negating the speed here..
      //We turned off .setinverted and kept -movespeed because rotatation is flipped without -movespeed
      differentialDrive.arcadeDrive(-moveSpeed, rotateSpeed, true);
    }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  

  }
}
