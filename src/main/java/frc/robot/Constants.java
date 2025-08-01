// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  //Controller ports
  public static final int kDriverControllerPort = 0;

  //Device IDS
  public static final int FLeftDriveMotorID = 1;
  public static final int FRightDriveMotorID = 2;
  public static final int BLeftDriveMotorID = 3;
  public static final int BRightDriveMotorID = 4;
  public static final int FRShooterMotorID = 8;
  public static final int FLShooterMotorID = 7;
  public static final int BRShooterMotorID = 10;
  public static final int BLShooterMotorID = 9;

  //Controller Stuff
  public static final int controllerPort = 0;
  public static final double controllerDeadZone = 0.05; // Deadzone for the controller joystick

  //DriveTrain Stuff
  public static final double DriveTrainSpeed = 0.5;
  public static final double DriveTrainTurnSpeed = 0.5;

  //Shooter Stuff
  public static final double ShooterSpeed = 0.5;
  public static final double deliverySpeed = 0.35;
}
