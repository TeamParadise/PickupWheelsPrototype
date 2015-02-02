package org.usfirst.frc.team1165.robot.commands;

import org.usfirst.frc.team1165.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunTrashCanPickupMotorsFromJoystick extends Command
{

	public RunTrashCanPickupMotorsFromJoystick()
	{
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.trashCanPickupMotors);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		Robot.trashCanPickupMotors.reset();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		boolean runMotors = Robot.oi.shouldPickupCan();
		if (runMotors)
		{
			Robot.trashCanPickupMotors.pickUp();
		}
		else
		{
			Robot.trashCanPickupMotors.reset();
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
		Robot.trashCanPickupMotors.reset();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
