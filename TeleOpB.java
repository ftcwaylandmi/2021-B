package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="TeleOpB", group="11846")
public class TeleOpB extends OpMode{
    Robot myrobot =  new Robot();
    double left = 0.00;
    double right = 0.00;

    @Override
    public void init(){
        myrobot.initHW(hardwareMap);
    }

    @Override
    public void loop(){
        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;
        telemetry.addData("left", left);
        telemetry.addData("right", right);

        if (gamepad2.a){
            myrobot.SpinCarouselRight();
        } else if (gamepad2.b) {
            myrobot.SpinCarouselLeft();
        }else{
            myrobot.StopCarousel();
        }

        telemetry.update();
        myrobot.LeftDrive(right);
        myrobot.RightDrive(left);
    }
}
