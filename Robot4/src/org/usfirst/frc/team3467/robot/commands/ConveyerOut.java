package org.usfirst.frc.team3467.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3467.robot.subsystems.Conveyer;

public class ConveyerOut extends Command{

	protected void initialize() {
	}

	protected void execute() {
		Conveyer.conveyerTalon.set(-1.0);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {	
	}

	protected void interrupted() {

	}
}
