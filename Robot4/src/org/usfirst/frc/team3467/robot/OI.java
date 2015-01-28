package org.usfirst.frc.team3467.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3467.robot.commands.*;
import org.usfirst.frc.team3467.robot.Gamepad;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Gamepad xboxController;
	
	//Conveyer
	Button ConveyerIntake;
	Button ConveyerOuttake;
	//Arms
	Button Arm;
	

	public OI(){
		ConveyerIntake = new JoystickButton(xboxController, Gamepad.bButton);
		ConveyerIntake.whileHeld(new ConveyerIn());
		ConveyerOuttake = new JoystickButton(xboxController, Gamepad.xButton);
		ConveyerOuttake.whileHeld(new ConveyerOut());
		Arm = new JoystickButton(xboxController, Gamepad.aButton);
		Arm.toggleWhenPressed(new Arms());
		
	//Smart Dashboard Buttons
		SmartDashboard.putData("ConveyerIn", new ConveyerIn());
		SmartDashboard.putData("ConveyerOut", new ConveyerOut());
		SmartDashboard.putData("Arm Out", new ArmPosition(true));
		SmartDashboard.putData("Arm In", new ArmPosition(false));
	}
}

