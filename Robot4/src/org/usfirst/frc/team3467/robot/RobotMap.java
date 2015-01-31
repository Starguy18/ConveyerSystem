package org.usfirst.frc.team3467.robot;


import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.hal.CanTalonSRX;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static Talon ConveyerConveyerTalon;
	public static Solenoid ConveyerConveyerSolenoid;
	public static SolenoidBase ConveyerSolenoidBase1;
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;


	public static void initial(){
		ConveyerConveyerTalon = new Talon(0);
		LiveWindow.addActuator("Conveyer", "Conveyer Talon", (Talon) ConveyerConveyerTalon);
		
		ConveyerConveyerSolenoid = new Solenoid(0, 0);
		LiveWindow.addActuator("Conveyer", "ConveyerSolenoid", (Solenoid) ConveyerConveyerSolenoid);
	}
}
