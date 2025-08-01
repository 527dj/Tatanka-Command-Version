package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class RunShooter extends Command {
    private final Shooter shooter;
    private final double speed;

    public RunShooter(Shooter shooter, double speed) {
        this.shooter = shooter;
        this.speed = speed;
        addRequirements(shooter);
    }

    @Override
    public void execute() {
        shooter.setShooterSpeed(speed);
    }

    @Override
    public void end(boolean interrupted) {
        shooter.stopShooter();
        System.out.println("==========SHOOTER SUBSYSTEM DEACTIVATED==========");
    }

    @Override
    public void initialize(){
        if(speed<0){
            System.out.println("==========SHOOTER SUBSYSTEM REVERSERUNNING!==========");
        }
        else{
            System.out.println("==========SHOOTER SUBSYSTEM RUNNING==========");
        }
    }

    @Override
    public boolean isFinished() {
        return false; // runs until interrupted
    }
}
