/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Logger;
import frc.robot.Robot;

public class Command_ExtendBothAxles extends Command {
  private static final Logger log = new Logger(Command_ExtendBothAxles.class);
  private boolean isFinished = false;

  public Command_ExtendBothAxles() {
    requires(Robot.m_subsystemPneumatics);
    log.debug("***constructor");
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    log.debug("***initialize");
    this.isFinished = false;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    log.debug("***execute");
    Robot.m_subsystemPneumatics.extendBothAxles();
    this.isFinished = true;
  }

  @Override
  public synchronized void start() {
    log.debug("***start");
    super.start();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return this.isFinished;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    log.debug("***end");
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    log.debug("***interrupted");
  }
}
