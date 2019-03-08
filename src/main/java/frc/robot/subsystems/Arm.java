/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.Faults;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  WPI_TalonSRX armTalon;
  Faults fault;

  public Arm() {
    armTalon = new WPI_TalonSRX(RobotMap.ARM_TALON);
    fault = new Faults();
    armTalon.configPeakCurrentLimit(10);
    armTalon.configPeakCurrentDuration(100);
    armTalon.configContinuousCurrentLimit(10);
    // TODO: config sec
    // making method and object for our talon
  }

  public void printCurrentPosition() {
    armTalon.getFaults(fault);
    System.out.println("Sensor Vel: " + armTalon.getSelectedSensorVelocity());
    System.out.println("Sensor Pos: " + armTalon.getSelectedSensorPosition());
    System.out.println("Out % " + armTalon.getMotorOutputPercent());
    System.out.println(fault);
  }

  public void setArmPower(double power) {
    armTalon.set(ControlMode.PercentOutput, power);
  } //setting Arm Power

  public void setArmPosition(double position) {
    armTalon.set(ControlMode.Position, position);
    
//  find what tick corresponds to position on arm.
// DRIVER_CONTROLLER_Y.whenPressed();

// DRIVER_CONTROLLER_Y.whenReleased();

  }  
  
  public void raiseArmPosition(double height){
    armTalon.set(ControlMode.Position, height);
    //  if(controller.getPOV() == 0) {
      // increase power by 10
    }
      // if(controller.getPOV() == 180) {
      // decrease power by 10;
    

  

  public void pivotArmPosition(double degrees){
    armTalon.set(ControlMode.Position, degrees);

  // .whenPressed());

  // button6.whenPressed();
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
