/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author 997robotics3
 */
public class Shifter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    DoubleSolenoid gearSolenoid; 
    DoubleSolenoid omniOrTraction;
    
    public Shifter(int gearShiftSlot1, int gearShiftSlot2, int driveShiftSlot1, int driveShiftSlot2) {
       gearSolenoid = new DoubleSolenoid(gearShiftSlot1, gearShiftSlot2);
       omniOrTraction =  new DoubleSolenoid(driveShiftSlot1, driveShiftSlot2);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setOmni() {
        omniOrTraction.set(DoubleSolenoid.Value.kForward);
    }
    
    public void setTraction() {
        omniOrTraction.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void setHighGear() {
        gearSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void setLowGear() {
        gearSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public boolean getIsOmni() {
        return omniOrTraction.get().value == DoubleSolenoid.Value.kForward_val;
    }
}
