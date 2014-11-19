/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team1619.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team1619.RobotMap;
import org.team1619.commands.Drive;

/**
 *
 * @author DanielHathcock
 */
public class Drivetrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private RobotDrive drivetrain;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new Drive());
    }
    
    public Drivetrain()
    {
        drivetrain = new RobotDrive(RobotMap.frontLeft, RobotMap.backLeft, RobotMap.frontRight, RobotMap.backRight);
        drivetrain.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drivetrain.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    }
    
    public void drive(double x, double y, double z)
    {
        drivetrain.mecanumDrive_Cartesian(x, y, z, 0.0);
    }

    public void stop()
    {
        drivetrain.stopMotor();
    }
}
