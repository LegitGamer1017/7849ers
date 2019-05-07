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
import com.ctre.phoenix.motorcontrol.WPI_MotorSafetyImplem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // Grasping arm
  WPI_TalonSRX armTalon;
  // Elevator control
  WPI_TalonSRX elevatorTalon;
  // Tilt control
  WPI_TalonSRX tiltTalon;
  //Encoder


  Faults fault;

  public Arm() {
    armTalon = new WPI_TalonSRX(RobotMap.ARM_TALON);
    armTalon.configPeakCurrentLimit(5);
    armTalon.configPeakCurrentDuration(100);
    armTalon.configContinuousCurrentLimit(5);

    elevatorTalon = new WPI_TalonSRX(RobotMap.ELEVATOR_TALON);

    
    tiltTalon = new WPI_TalonSRX(RobotMap.TILT_TALON);
    double quadEncoderPos = tiltTalon.getSelectedSensorVelocity();

    // limitSwitch1 = new limitswi
    fault = new Faults();
  }

   /* public void printCurrentElevatorPosition() {
    elevatorTalon.getFaults(fault);
    System.out.println("Sensor Vel: " + elevatorTalon.getSelectedSensorVelocity());
    System.out.println("Sensor Pos: " + elevatorTalon.getSelectedSensorPosition());
    System.out.println("Out % " + elevatorTalon.getMotorOutputPercent());
    System.out.println(fault);
    System.out.println("Output Current: " + elevatorTalon.getOutputCurrent());
    System.out.println("Current Tempature is: " + elevatorTalon.getTemperature());
   } */

  public void setArmPower(double power) {
    armTalon.set(ControlMode.PercentOutput, power);
  }

  public void setElevatorPower(double power) {
    elevatorTalon.set(ControlMode.PercentOutput, power);
  }

  public void setTiltPower(double power) {
    tiltTalon.set(ControlMode.PercentOutput, power);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    // TODO: We currently do this from Robot. Move to here instead?
  }
}
