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
    double speed = 1.1; 
    if (dpad == 0) {
      // Up direction
      Robot.m_Arm.setArmPower(speed);
    } else if (dpad == 180) {
      // Down direction
      Robot.m_Arm.setArmPower(-speed);
    } else if (dpad == 90) {
      // Right direction
      Robot.m_Arm.printCurrentPosition();
    } else {
      // dpad = -1, no movement
      Robot.m_Arm.setArmPower(0);
    }
  }


  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
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
