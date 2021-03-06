/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.ArcadeDrive;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author 997robotics3
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    SpeedController l, r, s;
    
    public DriveTrain() {
        l = new Victor(RobotMap.leftMotorSlot);
        r = new Victor(RobotMap.rightMotorSlot);
        s = new Victor(RobotMap.middleMotorSlot);
    }
    public void drive(double left, double right, double strafe) {
        SmartDashboard.putNumber("leftSpeed", left);
        SmartDashboard.putNumber("rightSpeed", right);
        SmartDashboard.putNumber("strafeSpeed", strafe);
        
        l.set(left);
        r.set(right);
        if(CommandBase.subShifter.getIsOmni()) {
            s.set(strafe);
        } else {
            s.set(0);
        }
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ArcadeDrive());
    }
    
    public void SmartDashboard() {
        SmartDashboard.putData(this);
               
    }
    
    
}
