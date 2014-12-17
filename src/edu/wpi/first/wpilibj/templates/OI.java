package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.commands.ArcadeDrive;
import edu.wpi.first.wpilibj.templates.commands.ShiftDriveTrain;
import edu.wpi.first.wpilibj.templates.commands.ShiftGear;
import edu.wpi.first.wpilibj.templates.commands.TankDrive;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
/*
    Buttons on xbox
    a - 1
    b - 2
    x - 3
    y - 4
    lu trig - 5
    ru trig - 6
    
    
    
    
    */
    public Joystick gamepad = new Joystick(RobotMap.padPort);

    public double getForeBackAxis() {
       double value = deadband(gamepad.getY(GenericHID.Hand.kLeft));
        SmartDashboard.putNumber("Y left", value);
       return value;
    }

  private double deadband(double value){
      if (Math.abs(value)<.05){
          return 0;
      }
      return value;
  }

    public double getLeftRightAxis() {
        double value = deadband(gamepad.getX(GenericHID.Hand.kLeft));
                SmartDashboard.putNumber("leftright axis", value);   
        return value;
    }

    public double getTwistAxis() {
SmartDashboard.putNumber("twist", deadband(gamepad.getRawAxis(4)));
        return deadband(gamepad.getRawAxis(4));
    }

    public double getLeftSpeed() {
        return deadband(gamepad.getY(GenericHID.Hand.kLeft));
    }

    public double getRightSpeed() {
        return deadband(gamepad.getY(GenericHID.Hand.kRight));
    }

    //BOOTONS!!!!!!
    int arcadeDrive = 3;
    int tankDrive = 4;
    int shiftDriveTraction = 5;
    int shiftGearHi = 1;
    int shiftDriveOmni = 6;
    int shiftGearLow = 2;
    Button arcadeButt = new JoystickButton(gamepad, arcadeDrive);
    Button tankButt = new JoystickButton(gamepad, tankDrive);
    Button shiftTractionButt = new JoystickButton(gamepad, shiftDriveTraction);
    Button shiftHiButt = new JoystickButton(gamepad, shiftGearHi);
    Button shiftOmniButt = new JoystickButton(gamepad, shiftDriveOmni);
    Button shiftLowButt = new JoystickButton(gamepad, shiftGearLow);

   
    
    public OI(){
      
        arcadeButt.whenPressed(new ArcadeDrive());
        tankButt.whenPressed(new TankDrive());
        shiftTractionButt.whenPressed(new ShiftDriveTrain(false));
        shiftHiButt.whenPressed(new ShiftGear(true));
         shiftOmniButt.whenPressed(new ShiftDriveTrain(true));
        shiftLowButt.whenPressed(new ShiftGear(false));
    }
    
}
