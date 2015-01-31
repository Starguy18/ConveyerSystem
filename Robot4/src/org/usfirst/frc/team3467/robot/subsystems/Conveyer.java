
package org.usfirst.frc.team3467.robot.subsystems;

import org.usfirst.frc.team3467.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.hal.CanTalonSRX;
import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class Conveyer extends Subsystem {
   public static Talon conveyerTalon = RobotMap.ConveyerConveyerTalon;
   public static Solenoid conveyerSolenoid = RobotMap.ConveyerConveyerSolenoid;
   public static SolenoidBase SolenoidBase1 = RobotMap.ConveyerSolenoidBase1;
    public void initDefaultCommand() {
    	
    }
}

