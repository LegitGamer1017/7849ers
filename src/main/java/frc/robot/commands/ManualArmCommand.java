/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;



/**
 * An example command.  You can replace me with your own command.
 */
public class ManualArmCommand extends Command {
  public ManualArmCommand() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_Arm);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    int dpad = Robot.m_oi.driverController.getPOV();
    //int LimitSwitchValue1 = limitSwitch1.get();
    double arm_speed = 1.0;
    double elevator_speed = 1.0;
    double tilt_speed = 1.0;
   
    //if (limitSwitch1.get() == 0){
    //  Robot.setArmPower(10);
    //}
    
    // DPAD controls elevator
    if (dpad == 0) {
      // Up direction
      Robot.m_Arm.setElevatorPower(elevator_speed);
    } else if (dpad == 180) {
      // Down direction
      Robot.m_Arm.setElevatorPower(-elevator_speed);
    } else if (dpad == 90) {
      // Right direction

      // Debugging information to help us figure out what's going on?
      Robot.m_Arm.printCurrentElevatorPosition();
    } else {
      // dpad = -1, no movement
      Robot.m_Arm.setElevatorPower(0);
    }

    // Tilt controlled by X and A buttons
    if (Robot.m_oi.driverController.getRawButton(RobotMap.DRIVER_CONTROLLER_X)) {
      Robot.m_Arm.setTiltPower(tilt_speed);
    } else if (Robot.m_oi.driverController.getRawButton(RobotMap.DRIVER_CONTROLLER_A)) {
      Robot.m_Arm.setTiltPower(-tilt_speed);
    } else {
      Robot.m_Arm.setTiltPower(0);
    }

    // Grasping arm controlled by Y and B
    if (Robot.m_oi.driverController.getRawButton(RobotMap.DRIVER_CONTROLLER_Y)) {
      Robot.m_Arm.setArmPower(arm_speed);
    } else if (Robot.m_oi.driverController.getRawButton(RobotMap.DRIVER_CONTROLLER_B)) {
      Robot.m_Arm.setArmPower(-arm_speed);
    } else {
      Robot.m_Arm.setArmPower(0);
    }

  }


  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    // return Robot.m_Arm.stopArmMovement();
    
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
