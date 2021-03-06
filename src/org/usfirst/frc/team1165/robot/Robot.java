package org.usfirst.frc.team1165.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team1165.robot.commands.RunBoxPickupWheelsFromJoystick;
import org.usfirst.frc.team1165.robot.subsystems.BoxPickupWheels;
import org.usfirst.frc.team1165.robot.subsystems.LeftTrashCanPickupMotor;
import org.usfirst.frc.team1165.robot.subsystems.RightTrashCanPickupMotor;
import org.usfirst.frc.team1165.robot.subsystems.ServoMotor;

;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot
{
	public static final BoxPickupWheels boxPickupWheels = new BoxPickupWheels();
	//public static final TrashCanPickupMotors trashCanPickupMotors = new TrashCanPickupMotors();
	public static final LeftTrashCanPickupMotor leftTrashCanPickupMotor = new LeftTrashCanPickupMotor();
	public static final RightTrashCanPickupMotor rightTrashCanPickupMotor = new RightTrashCanPickupMotor();
	public static final ServoMotor servoMotor = new ServoMotor();
	public static OI oi;

	Command autonomousCommand;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit()
	{
		oi = new OI();
		// instantiate the command used for the autonomous period
		autonomousCommand = null;
	}

	public void disabledPeriodic()
	{
		Scheduler.getInstance().run();
	}

	public void autonomousInit()
	{
		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic()
	{
		Scheduler.getInstance().run();
	}

	public void teleopInit()
	{
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
		new RunBoxPickupWheelsFromJoystick();
	}

	/**
	 * This function is called when the disabled button is hit. You can use it
	 * to reset subsystems before shutting down.
	 */
	public void disabledInit()
	{

	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic()
	{
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic()
	{
		LiveWindow.run();
	}
}
