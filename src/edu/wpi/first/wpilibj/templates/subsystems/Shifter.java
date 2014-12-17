/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author 997robotics3
 */
public class Shifter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    DoubleSolenoid gearSolenoid; 
    DoubleSolenoid omniOrTraction;
    Compressor compressor;
    
    public Shifter(int gearShiftSlot1, int gearShiftSlot2, int driveShiftSlot1, int driveShiftSlot2, int CompressorSlot, int pressureSwitchSlot) {
       gearSolenoid = new DoubleSolenoid(gearShiftSlot1, gearShiftSlot2);
       omniOrTraction =  new DoubleSolenoid(driveShiftSlot1, driveShiftSlot2);
     //  compressor = new Compressor(pressureSwitchSlot, CompressorSlot);
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
     
    private boolean getIsHigh() {
        return gearSolenoid.get().value == DoubleSolenoid.Value.kForward_val;
    }
    public void SmartDashboard() {
        SmartDashboard.putBoolean("is in high gear", getIsHigh());
        SmartDashboard.putBoolean("is omni", getIsOmni());
        SmartDashboard.putData(this);
    }

   
}
