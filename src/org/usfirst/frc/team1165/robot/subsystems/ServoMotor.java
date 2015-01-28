package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.RobotMap;
import org.usfirst.frc.team1165.robot.commands.RunServoMotorFromJoystick;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ServoMotor extends Subsystem
{
	Servo servoMotor = new Servo(RobotMap.servoMotor);
	
	/**
	 * Accepts a value from 0 to 180 and sets the servo to the given angle
	 * 
	 * @param angle
	 */
	public void spinToAngle(int angle)
	{
		servoMotor.setAngle(angle);
	}
	
	/**
	 * Resets the servo back to the default position at an angle of 90°
	 */
	public void reset()
	{
		servoMotor.setAngle(0);
	}

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		setDefaultCommand(new RunServoMotorFromJoystick());
	}
}
