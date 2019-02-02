/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveArcadeCommand;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  WPI_VictorSPX leftFrontVictorSPX = null;
  WPI_VictorSPX leftBackVictorSPX = null;
  WPI_VictorSPX rightFrontVictorSPX = null;
  WPI_VictorSPX rightBackVictorSPX = null;

  DifferentialDrive differentialDrive = null;

  public Drivetrain() {
// VictorSPX
    leftFrontVictorSPX = new WPI_VictorSPX(RobotMap.DRIVETRAIN_LEFT_FRONT_VICTORSPX);
    leftBackVictorSPX = new WPI_VictorSPX(RobotMap.DRIVETRAIN_LEFT_BACK_VICTORSPX);
    rightFrontVictorSPX = new WPI_VictorSPX(RobotMap.DRIVETRAIN_RIGHT_FRONT_VICTORSPX);
    rightBackVictorSPX = new WPI_VictorSPX(RobotMap.DRIVETRAIN_RIGHT_BACK_VICTORSPX);

    SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFrontVictorSPX, leftBackVictorSPX);
    SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFrontVictorSPX, rightBackVictorSPX);

    leftMotors.setInverted(true);
    rightMotors.setInverted(true);

    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
  }

    public void arcadeDrive(double moveSpeed, double rotateSpeed) {
      differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
    }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    // setDefaultCommand(new DriveArcadeCommand());
  }
}
