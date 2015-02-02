package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.RobotMap;
import org.usfirst.frc.team1165.robot.commands.RunTrashCanPickupMotorsFromJoystick;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TrashCanPickupMotors extends Subsystem
{    
    Talon leftTrashCanPickupMotor = new Talon(RobotMap.leftTrashCanPickupMotor);
    Talon rightTrashCanPickupMotor = new Talon(RobotMap.rightTrashCanPickupMotor);
    
    public void pickUp() //WIP
    {
    	leftTrashCanPickupMotor.set(0.25);
    	rightTrashCanPickupMotor.set(0.25);
    	try
    	{
			Thread.sleep(2000);
		}
    	catch (Exception q)
    	{
    		//Need to return motors to default position before stopping them
        	leftTrashCanPickupMotor.set(0);
        	rightTrashCanPickupMotor.set(0);
        	leftTrashCanPickupMotor.stopMotor();
        	rightTrashCanPickupMotor.stopMotor();
		}
    	leftTrashCanPickupMotor.set(0);
    	rightTrashCanPickupMotor.set(0);
    	
    }
    
    public void reset() //WIP
    {
    	//Need to return motors to default position before stopping them
    	leftTrashCanPickupMotor.set(0);
    	rightTrashCanPickupMotor.set(0);
    	leftTrashCanPickupMotor.stopMotor();
    	rightTrashCanPickupMotor.stopMotor();
    }

    public void initDefaultCommand()
    {
        setDefaultCommand(new RunTrashCanPickupMotorsFromJoystick());
    }
}

