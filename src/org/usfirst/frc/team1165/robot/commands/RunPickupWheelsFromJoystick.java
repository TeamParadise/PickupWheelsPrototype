package org.usfirst.frc.team1165.robot.commands;

import org.usfirst.frc.team1165.robot.OI;
import org.usfirst.frc.team1165.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunPickupWheelsFromJoystick extends Command
{

	public RunPickupWheelsFromJoystick()
	{
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.pickupWheels);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		Robot.pickupWheels.idle();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		final double pickupSpeedX = OI.getInstance().pickupSpeedX();
		final double pickupSpeedY = OI.getInstance().pickupSpeedY();
		
		final double magnitudeX = Math.abs(pickupSpeedX);
		final double magnitudeY = Math.abs(pickupSpeedY);

		if (magnitudeY > 0.1 && magnitudeY > magnitudeX * 2)
		{
			if (pickupSpeedY > 0)
			{
				Robot.pickupWheels.spinOut(magnitudeY);
			}
			else
			{
				Robot.pickupWheels.spinIn(magnitudeY);				
			}
		}
		else if (magnitudeX > 0.1 && magnitudeX > magnitudeY * 2)
		{
			if (pickupSpeedX > 0)
			{
				Robot.pickupWheels.spinRight(magnitudeX);
			}
			else
			{
				Robot.pickupWheels.spinLeft(magnitudeX);
			}
		}
		else
		{
			Robot.pickupWheels.idle();
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
		Robot.pickupWheels.idle();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}