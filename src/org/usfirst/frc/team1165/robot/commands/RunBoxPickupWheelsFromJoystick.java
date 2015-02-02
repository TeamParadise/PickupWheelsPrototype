package org.usfirst.frc.team1165.robot.commands;

import org.usfirst.frc.team1165.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunBoxPickupWheelsFromJoystick extends Command
{

	public RunBoxPickupWheelsFromJoystick()
	{
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.boxPickupWheels);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		Robot.boxPickupWheels.idle();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		final double pickupSpeedX = Robot.oi.boxPickupSpeedX();
		final double pickupSpeedY = Robot.oi.boxPickupSpeedY();
		
		final double magnitudeX = Math.abs(pickupSpeedX);
		final double magnitudeY = Math.abs(pickupSpeedY);

		if (magnitudeY > 0.1 && magnitudeY > magnitudeX * 2)
		{
			if (pickupSpeedY > 0)
			{
				Robot.boxPickupWheels.spinOut(magnitudeY);
			}
			else
			{
				Robot.boxPickupWheels.spinIn(magnitudeY);				
			}
		}
		else if (magnitudeX > 0.1 && magnitudeX > magnitudeY * 2)
		{
			if (pickupSpeedX > 0)
			{
				Robot.boxPickupWheels.spinRight(magnitudeX);
			}
			else
			{
				Robot.boxPickupWheels.spinLeft(magnitudeX);
			}
		}
		else
		{
			Robot.boxPickupWheels.idle();
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return false;
	}

	// Called once after isFinished returns true
	protected void end()
	{
		Robot.boxPickupWheels.idle();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}