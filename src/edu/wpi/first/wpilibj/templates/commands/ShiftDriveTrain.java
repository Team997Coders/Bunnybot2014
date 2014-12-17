/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 *
 * @author 997robotics3
 */
public class ShiftDriveTrain extends CommandBase {
    boolean isOmni;
    
    /**
     * True if OmniDriveTrain, false if DriveTrain
     * @param isOmni 
     */
    public ShiftDriveTrain(boolean isOmni) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(subShifter);
        this.isOmni = isOmni;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }
    /**
     * Will be called on the pressed event of the button
     */
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (isOmni) {
           subShifter.setOmni();
        } else {
            subShifter.setTraction();
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
