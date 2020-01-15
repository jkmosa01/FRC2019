/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 * An example command.  You can replace me with your own command.
 */
public class DriveMecanum extends Command {
  public DriveMecanum() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.drivetrain);
  }

  // // Called just before this Command runs the first time
  // @Override
  // protected void initialize() {
  // }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double x, y, twist;
    y = OI.steeringWheel.getThrottle();
    twist = OI.steeringWheel.getX(GenericHID.Hand.kLeft);
//    x = OI.deadZone(OI.controller.getX(GenericHID.Hand.kLeft), RobotMap.getTranslationaldeadzone());
//    y = OI.deadZone(OI.controller.getY(GenericHID.Hand.kLeft), RobotMap.getTranslationaldeadzone());
//    twist = OI.deadZone(OI.controller.getX(GenericHID.Hand.kRight), RobotMap.getRotationaldeadzone());
//    if(Robot.getChildMode()){x/=4;y/=5;twist/=5;}
//
    Robot.drivetrain.getDrivetrain().driveCartesian(0, -y, twist);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // // Called once after isFinished returns true
  // @Override
  // protected void end() {
  // }

  // // Called when another command which requires one or more of the same
  // // subsystems is scheduled to run
  // @Override
  // protected void interrupted() {
  // }
}
