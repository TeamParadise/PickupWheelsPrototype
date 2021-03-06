package org.usfirst.frc.team1165.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	public static final int joystickPort1 = 1;
	public static final int joystickPort2 = 2;
	public static final int joystickPort3 = 3;
	
	public static final int leftTrashCanPickupMotor = 5;
	public static final int rightTrashCanPickupMotor = 6;
	
	public static final int servoMotor = 7;

	public static final int leftBoxPickupWheel = 8;
	public static final int rightBoxPickupWheel = 9;
	
	public static final int leftPot = 1;
	public static final int rightPot = 2;
}
