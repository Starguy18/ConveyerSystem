package org.usfirst.frc.team3467.robot.commands;

import org.usfirst.frc.team3467.robot.subsystems.Conveyer;

import edu.wpi.first.wpilibj.command.*;

public class ArmPosition extends Command{
	
	boolean Out;
	
	public ArmPosition(boolean Out){
		this.Out = Out;
	}
	
	protected void initialize() {	
	}

	protected void execute() {
		if (Out = true){
			Conveyer.conveyerSolenoid.set(true);
		}
		else{
			Conveyer.conveyerSolenoid.set(false);
		}
	}


	protected boolean isFinished() {
		Conveyer.conveyerSolenoid.set(false);
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
