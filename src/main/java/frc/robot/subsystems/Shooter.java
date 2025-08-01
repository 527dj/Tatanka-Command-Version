package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
public class Shooter extends SubsystemBase {
    // TalonSRX motor controllers
    private final TalonSRX FRShooterMotor;
    private final TalonSRX FLShooterMotor;
    private final TalonSRX BRShooterMotor;
    private final TalonSRX BLShooterMotor;

    public Shooter() {
        FRShooterMotor = new TalonSRX(Constants.FRShooterMotorID);
        FLShooterMotor = new TalonSRX(Constants.FLShooterMotorID);
        BRShooterMotor = new TalonSRX(Constants.BRShooterMotorID);
        BLShooterMotor = new TalonSRX(Constants.BLShooterMotorID);
        configureMotors();
    }

    private void configureMotors() {
        FLShooterMotor.follow(BLShooterMotor);
        FRShooterMotor.follow(BRShooterMotor);
    }

    public void setShooterSpeed(double speed) {
        BRShooterMotor.set(ControlMode.PercentOutput, speed);
        BLShooterMotor.set(ControlMode.PercentOutput, -speed);
    }

    public void stopShooter() {
        BRShooterMotor.set(ControlMode.PercentOutput,0);
        BLShooterMotor.set(ControlMode.PercentOutput,0);
    }
}