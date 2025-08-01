package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Drivetrain extends SubsystemBase {
    private final TalonSRX frontLeftMotor;
    private final TalonSRX frontRightMotor;
    private final TalonSRX backLeftMotor;
    private final TalonSRX backRightMotor;

    public Drivetrain() {
        frontLeftMotor = new TalonSRX(Constants.FLeftDriveMotorID);
        frontRightMotor = new TalonSRX(Constants.FRightDriveMotorID);
        backLeftMotor = new TalonSRX(Constants.BLeftDriveMotorID);
        backRightMotor = new TalonSRX(Constants.BRightDriveMotorID);
    }

    public void drive(double speed, double turn) {
        double leftSpeed = Constants.DriveTrainSpeed * speed + turn;
        double rightSpeed = Constants.DriveTrainSpeed * speed - turn;

        frontLeftMotor.set(ControlMode.PercentOutput, leftSpeed);
        backLeftMotor.set(ControlMode.PercentOutput, leftSpeed);
        frontRightMotor.set(ControlMode.PercentOutput, rightSpeed);
        backRightMotor.set(ControlMode.PercentOutput, rightSpeed);
    }
}