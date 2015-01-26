package org.usfirst.frc.team1165.robot.commands;

import org.usfirst.frc.team1165.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PickupWheelsStop extends Command
{

	private boolean isFinished = false;

	public PickupWheelsStop()
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
		Robot.pickupWheels.idle();
		isFinished = true;
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return isFinished;
	}

	// Called once after isFinished returns true
	protected void end()
	{
		Robot.pickupWheels.idle();
		new RunPickupWheelsFromJoystick();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
