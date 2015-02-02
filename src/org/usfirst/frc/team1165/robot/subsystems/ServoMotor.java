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
	
	public void spinToPosition(double position)
	{
		servoMotor.set(position);
	}
	
	/**
	 * Resets the servo back to the default position at an angle of 90°
	 */
	public void reset()
	{
		servoMotor.set(0.5);
	}

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		setDefaultCommand(new RunServoMotorFromJoystick());
	}
}
