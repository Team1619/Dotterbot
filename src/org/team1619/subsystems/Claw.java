/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team1619.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team1619.RobotMap;
import org.team1619.commands.MoveClaw;

/**
 *
 * @author camerontaleghani
 */
public class Claw extends Subsystem 
{
    Jaguar clawMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Claw()
    {
        clawMotor = new Jaguar(RobotMap.claw);
    }
    
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new MoveClaw());
    }
    
    public void startMove(double speed)
    {
        clawMotor.set(speed);
    }
    
    public void stopMove()
    {
        startMove(0);
    }
}
