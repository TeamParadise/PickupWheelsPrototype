package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class RightTrashCanPickupMotor extends PIDSubsystem {

	Talon motor = new Talon(RobotMap.rightTrashCanPickupMotor);
	
	public static final double LOWERED = LeftTrashCanPickupMotor.LOWERED;
	public static final double RAISED = LeftTrashCanPickupMotor.RAISED;
	
    public RightTrashCanPickupMotor() {
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    	super("RightMotor", 0, 0, 0);
    	
    	setSetpoint(LOWERED);
    	enable();
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
    	return 0.0;
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
}
