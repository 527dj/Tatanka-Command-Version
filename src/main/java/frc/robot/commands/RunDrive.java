package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RunDrive extends Command {
    private final Drivetrain drivetrain;
    private final CommandXboxController controller;

    public RunDrive(Drivetrain drivetrain, CommandXboxController controller) {
        this.drivetrain = drivetrain;
        this.controller = controller;
        addRequirements(drivetrain);
    }

    @Override
    public void execute() {
        double speed = controller.getRightX();  // forward/back
        double turn = controller.getLeftY();   // turning
        drivetrain.drive(speed, turn);
    }

    @Override
    public boolean isFinished() {
        return false; // runs continuously
    }
}
