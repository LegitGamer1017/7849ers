/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  public static final int DRIVETRAIN_LEFT_FRONT_VICTORSPX = 1;
	public static final int DRIVETRAIN_LEFT_BACK_VICTORSPX = 2;
	public static final int DRIVETRAIN_RIGHT_FRONT_VICTORSPX = 3;
  public static final int DRIVETRAIN_RIGHT_BACK_VICTORSPX = 4;
  
  //Joystick
	public static final int OI_DRIVER_CONTROLLER = 0;
  public static final int DRIVER_CONTROLLER_MOVE_AXIS = 1; // Y-axis of Left Joystick
  public static final int DRIVER_CONTROLLER_ROTATE_AXIS = 2; // X-axis of Right Joystick 
  public static final int DRIVER_CONTROLLER_X = 3;
  public static final int DRIVER_CONTROLLER_A = 4;
  public static final int DRIVER_CONTROLLER_B = 5;
  public static final int DRIVER_CONTROLLER_Y = 6;
  public static final int DRIVER_CONTROLLER_LB = 7;
  public static final int DRIVER_CONTROLLER_RB = 8;
  public static final int DRIVER_CONTROLLER_LEFTTRIGGER = 9;
  public static final int DRIVER_CONTROLLER_RIGHTTRIGGER = 10;
  public static final int DRIVER_CONTROLLER_BACK = 11;
  public static final int DRIVER_CONTROLLER_START = 12;
  public static final int DRIVER_CONTROLLER_LEFTTRIGGERCLICK = 13;
  public static final int DRIVER_CONTROLLER_RIGHTTRIGGERCLICK = 14;


  
  public static final int ARM_TALON = 5; //arm

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}


