package org.usfirst.frc.team1165.robot.commands;

import org.usfirst.frc.team1165.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunServoMotorFromJoystick extends Command
{

	public RunServoMotorFromJoystick()
	{
		requires(Robot.servoMotor);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		Robot.servoMotor.reset();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		Robot.servoMotor.spinToPosition((Robot.oi.twistAngle() + 1.0) / 2.0);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return false;
	}

	// Called once after isFinished returns true
	protected void end()
	{
		Robot.servoMotor.reset();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
