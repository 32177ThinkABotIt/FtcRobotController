package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Intake {
    private DcMotor intakeMotor;
    public Intake(HardwareMap hardwareMap) {
        intakeMotor = hardwareMap.get(DcMotor.class, "intake");
    }
    public void power(double power, boolean button) {
        if (button) {
            intakeMotor.setPower(Math.max(-1.0, Math.min(1.0, power)));
        } else {
            intakeMotor.setPower(0);
        }
    }
}
