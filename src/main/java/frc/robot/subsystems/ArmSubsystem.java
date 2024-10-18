package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ArmSubsystem {
    private CANSparkMax liftArmMotor = new CANSparkMax(8, MotorType.kBrushless);
    private CANSparkMax rotateArmMotor1 = new CANSparkMax(16, MotorType.kBrushless);
    private CANSparkMax rotateArmMotor2 = new CANSparkMax(18, MotorType.kBrushless);
    
    public void runElbow(double speed) {
        rotateArmMotor1.set(-speed);
        rotateArmMotor2.set(speed);
    }

    public void liftArm(double speed) {
        liftArmMotor.set(-speed);
    }
}