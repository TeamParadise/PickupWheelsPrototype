package org.usfirst.frc.team1165.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team1165.robot.commands.PickupWheelsSpinIn;
import org.usfirst.frc.team1165.robot.commands.PickupWheelsSpinLeft;
import org.usfirst.frc.team1165.robot.commands.PickupWheelsSpinOut;
import org.usfirst.frc.team1165.robot.commands.PickupWheelsSpinRight;
import org.usfirst.frc.team1165.robot.commands.PickupWheelsStop;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
	// // CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	// // TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	private final Joystick mainJoystick = new Joystick(RobotMap.joystickPort1);
	private final Joystick secondaryJoystick = new Joystick(RobotMap.joystickPort2);
	private final Joystick tertiaryJoystick = new Joystick(RobotMap.joystickPort3);

	public OI()
	{
		SmartDashboard.putData(new PickupWheelsStop());
		SmartDashboard.putData(new PickupWheelsSpinIn());
		SmartDashboard.putData(new PickupWheelsSpinOut());
		SmartDashboard.putData(new PickupWheelsSpinRight());
		SmartDashboard.putData(new PickupWheelsSpinLeft());
	}

	public double driveSpeedX()
	{
		return mainJoystick.getX();
	}

	public double driveSpeedY()
	{
		return -mainJoystick.getY();
	}

	public double boxPickupSpeedX()
	{
		return secondaryJoystick.getX();
	}

	public double boxPickupSpeedY()
	{
		// Pushing forward on the joystick returns negative y values.
		// We want the reverse of that.
		return -secondaryJoystick.getY();
	}
	
	public boolean shouldPickupCan()
	{
		if (tertiaryJoystick.getY() < -0.1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double twistAngle()
	{
		return secondaryJoystick.getTwist();
	}
}
