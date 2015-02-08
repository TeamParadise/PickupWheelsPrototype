package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.RobotMap;
import org.usfirst.frc.team1165.robot.commands.RunTrashCanPickupMotorsFromJoystick;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class LeftTrashCanPickupMotor extends PIDSubsystem //Master subsystem
{
	Talon motor = new Talon(RobotMap.leftTrashCanPickupMotor);
	AnalogPotentiometer pot = new AnalogPotentiometer(RobotMap.leftPot);

	public static final double LOWERED = 0;
	public static final double RAISED = 5.0;

	public LeftTrashCanPickupMotor()
	{
		// Use these to get going:
		// setSetpoint() - Sets where the PID controller should move the system
		// to
		// enable() - Enables the PID controller.
		super("LeftMotor", 1, 0, 0);
		setAbsoluteTolerance(0.05);
		getPIDController().setContinuous(false);
		setSetpoint(LOWERED);
		enable();
	}

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new RunTrashCanPickupMotorsFromJoystick());
	}

	protected double returnPIDInput()
	{
		// Return your input value for the PID loop
		// e.g. a sensor, like a potentiometer:
		// yourPot.getAverageVoltage() / kYourMaxVoltage;
		return pot.get();
	}

	protected void usePIDOutput(double output)
	{
		// Use output to drive your system, like a motor
		// e.g. yourMotor.set(output);
		motor.set(output);
	}
}
