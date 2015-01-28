package org.usfirst.frc.team3467.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3467.robot.subsystems.Conveyer;

public class Arms extends Command{

	protected void initialize() {
	}

	protected void execute() {
		Conveyer.conveyerSolenoid.set(true);
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
