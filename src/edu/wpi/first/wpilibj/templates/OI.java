package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.ArcadeDrive;
import edu.wpi.first.wpilibj.templates.commands.ShiftDriveTrain;
import edu.wpi.first.wpilibj.templates.commands.ShiftGear;
import edu.wpi.first.wpilibj.templates.commands.TankDrive;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    public Joystick gamepad = new Joystick(RobotMap.padPort);

    public double getForeBackAxis() {

        return gamepad.getY(GenericHID.Hand.kLeft);
    }

  

    public double getLeftRightAxis() {
        return gamepad.getX(GenericHID.Hand.kLeft);
    }

    public double getTwistAxis() {

        return gamepad.getX(GenericHID.Hand.kRight);
    }

    public double getLeftSpeed() {
        return gamepad.getY(GenericHID.Hand.kLeft);
    }

    public double getRightSpeed() {
        return gamepad.getY(GenericHID.Hand.kRight);
    }

    //BOOTONS!!!!!!
    int arcadeDrive = 2;
    int tankDrive = 4;
    int shiftDriveTraction = 3;
    int shiftGearHi = 5;
    int shiftDriveOmni = 3;
    int shiftGearLow = 5;
    Button arcadeButt = new JoystickButton(gamepad, arcadeDrive);
    Button tankButt = new JoystickButton(gamepad, tankDrive);
    Button shiftTractionButt = new JoystickButton(gamepad, shiftDriveTraction);
    Button shiftHiButt = new JoystickButton(gamepad, shiftGearHi);
    Button shiftOmniButt = new JoystickButton(gamepad, shiftDriveTraction);
    Button shiftLowButt = new JoystickButton(gamepad, shiftGearHi);

   
    
    public OI(){
      
        arcadeButt.whenPressed(new ArcadeDrive());
        tankButt.whenPressed(new TankDrive());
        shiftTractionButt.whenPressed(new ShiftDriveTrain(false));
        shiftHiButt.whenPressed(new ShiftGear(true));
         shiftOmniButt.whenPressed(new ShiftDriveTrain(true));
        shiftLowButt.whenPressed(new ShiftGear(false));
    }
    
}
