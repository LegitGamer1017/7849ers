package frc.robot;

/**
 * Record all magic numbers for sensors, CAN bus IDs, controllers, etc here, so
 * we can talk about thing by name instead of meaningless number.
 */
public class RobotMap {
  // CAN BUS IDs (for e.g. motor controllers)
  //Set in phoenix tuner application
  //Assign id's by plugging it in through USB and wifi 
  public static final int DRIVETRAIN_LEFT_FRONT_VICTORSPX = 1; 
	public static final int DRIVETRAIN_LEFT_BACK_VICTORSPX = 2;
	public static final int DRIVETRAIN_RIGHT_FRONT_VICTORSPX = 3;
  public static final int DRIVETRAIN_RIGHT_BACK_VICTORSPX = 4;
  public static final int ARM_TALON = 5;
  public static final int ELEVATOR_TALON = 7;
  public static final int TILT_TALON = 6;

  
  // Controller joysticks (these are a guess... please verify and remove this comment?)
  public static final int JOY_LEFT_X = 0;
  public static final int JOY_LEFT_Y = 1;
  public static final int JOY_RIGHT_X = 2;
  public static final int JOY_RIGHT_Y = 3;
  public static final int DRIVER_CONTROLLER_MOVE_AXIS = JOY_LEFT_Y;
  public static final int DRIVER_CONTROLLER_ROTATE_AXIS = JOY_RIGHT_X;

  // Controller buttons
  public static final int DRIVER_CONTROLLER_X = 1;
  public static final int DRIVER_CONTROLLER_A = 2;
  public static final int DRIVER_CONTROLLER_B = 3; 
  public static final int DRIVER_CONTROLLER_Y = 4; 
  public static final int DRIVER_CONTROLLER_LB = 5;
  public static final int DRIVER_CONTROLLER_RB = 6;
  public static final int DRIVER_CONTROLLER_LEFTTRIGGER = 7;
  public static final int DRIVER_CONTROLLER_RIGHTTRIGGER = 8;
  public static final int DRIVER_CONTROLLER_BACK = 9;
  public static final int DRIVER_CONTROLLER_START = 10;
  public static final int DRIVER_CONTROLLER_LEFTTRIGGERCLICK = 11;
  public static final int DRIVER_CONTROLLER_RIGHTTRIGGERCLICK = 12;

  // The ID of the controller to use
  public static final int OI_DRIVER_CONTROLLER = 0;
}
