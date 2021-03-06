/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.Timer;

public class Grabber extends Command {
  boolean isPressured;
  public Grabber() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.duck);
    isPressured = true;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // if(!Robot.compressor.enabled()){
    //   isPressured = true;
    //   Robot.compressor.setClosedLoopControl(false);
    // }
    // else{
    //   Robot.compressor.setClosedLoopControl(true);
    // }
    // Robot.compressor.setClosedLoopControl(true);
    if (OI.controller.getAButtonPressed()) {
      if(Robot.getChildMode()){
        Timer.delay(0.25);
      }
      if (Robot.duck.getValue()!=Value.kForward) {
        Robot.duck.openDucc();
      }
      else {
        Robot.duck.closeDucc();
      }
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
