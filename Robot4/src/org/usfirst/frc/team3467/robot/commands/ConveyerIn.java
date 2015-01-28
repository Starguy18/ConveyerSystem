package org.usfirst.frc.team3467.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3467.robot.subsystems.Conveyer;

public class ConveyerIn extends Command {
	
	
	protected void initialize() {
		
	}

	protected void execute() {
		Conveyer.conveyerTalon.set(1.0);
		
	}


	protected boolean isFinished() {

		return false;
	}


	protected void end() {

		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
}


