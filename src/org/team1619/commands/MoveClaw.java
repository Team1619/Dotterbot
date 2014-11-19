/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team1619.commands;

/**
 *
 * @author DanielHathcock
 */
public class MoveClaw extends CommandBase {
    
    public MoveClaw() {
        requires(claw);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setInterruptible(true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        claw.startMove(oi.rightJoystick.getX());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        claw.stopMove();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        claw.stopMove();
    }
}
