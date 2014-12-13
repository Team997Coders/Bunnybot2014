package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap extends RobotMapC{
   public static int padPort = USB1;
   public static int gearShiftSlot1 = Pnuematics1;
   public static int gearShiftSlot2  = Pnuematics2;
   public static int driveShiftSlot1 = Pnuematics3;
   public static int driveShiftSlot2 = Pnuematics4;
   public static int leftMotorSlot = PWM1;
   public static int rightMotorSlot = PWM2;
   public static int middleMotorSlot = PWM3;
   public static int Compressor = Relay1;
   public static int Gyro = Analog1;
   public static int LeftEncoderSlot1 = DigitalIO_1;
   public static int LeftEncoderSlot2 = DigitalIO_2;
   public static int StrafeEncoderSlot1 = 1;
   public static int RightEncoderSlot1 = DigitalIO_3;
   public static int RightEncoderSlot2 = DigitalIO_4;
   public static int StrafeEncoderSlot2 = 1;
           
   public static double deadbandVal = .1;
    public static double leftErrorCoeficient;
    public static double rightErrorCoeficient;
    public static double strafeErrorCoeficient;
    public static double encoderErrorRate;
       
   
   
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
