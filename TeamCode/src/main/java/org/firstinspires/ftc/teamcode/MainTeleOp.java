package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Main TeleOp")
public class MainTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() {
        Robot robot = new Robot(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {
            robot.intake.power(1.0, gamepad1.a);

            if (gamepad1.aWasPressed())
                robot.drivetrain.resetIMU();

            double forward = -gamepad1.left_stick_y;
            double right = gamepad1.left_stick_x;
            double rotate = gamepad1.right_stick_x;

            if (gamepad1.left_bumper)
                robot.drivetrain.drive(forward, right, rotate);
             else
                robot.drivetrain.driveFieldRelative(forward, right, rotate);

        }
    }
}
