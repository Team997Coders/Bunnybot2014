/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 * 
 * @author 997robotics3
 */
public class ShiftGear extends CommandBase {
    boolean isHigh;
    
    /**
     * True if shifting to high, 
     * @param isHigh 
     */
    public ShiftGear(boolean isHigh) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(subDriveTrain);
        this.isHigh = isHigh;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (isHigh) {
        subShifter.setHighGear();
        }
        else {
            subShifter.setLowGear();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
