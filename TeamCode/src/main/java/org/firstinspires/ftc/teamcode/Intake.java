package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;

public class Intake {
    DcMotor intakeMotor;
    Gamepad gamepad1;
    double power = 1;
    void Ball_Collection() {
        if (gamepad1.a)
            intakeMotor.setPower(power);
    }
}
