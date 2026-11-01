package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

public class Robot {
    public final Intake intake;
    public final Drivetrain drivetrain;

    public Robot(HardwareMap hardwareMap) {
        intake = new Intake(hardwareMap);
        drivetrain = new Drivetrain(hardwareMap);
    }
}
