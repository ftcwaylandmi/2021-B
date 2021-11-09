package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="TeleOpB", group="11846")
public class TeleOpB extends OpMode{
    Robot myrobot =  new Robot();
    double left = 0.00;
    double right = 0.00;
    double carouselleft = 0.00;
    double carouselright = 0.00;

    @Override
    public void init(){
        myrobot.initHW(hardwareMap);
    }

    @Override
    public void loop(){
        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;
        carouselleft = gamepad2.left_trigger;
        //carouselright = gamepad2.right_trigger;
        telemetry.addData("left", left);
        telemetry.addData("right", right);
        telemetry.addData("carouselleft", carouselleft);
        telemetry.addData("carouselright",carouselright);

        if (gamepad1.right_bumper){
            myrobot.LeftDrive(right);
            myrobot.RightDrive(left);
        }else{
            myrobot.LeftDrive(right/2);
            myrobot.RightDrive(left/2);
        }

        if (gamepad2.a){
            myrobot.MoveBottomArmForward();
        }else if(gamepad2.b){
            myrobot.MoveBottomArmBackward();
        }else {
            myrobot.StopBottomArm();
        }

        if (gamepad2.x){
            myrobot.MoveTopArmForward();
        }else if(gamepad2.y){
            myrobot.MoveTopArmBackward();
        }else {
            myrobot.StopTopArm();
        }

        telemetry.update();
        myrobot.SpinCarouselLeft(carouselleft);
        myrobot.SpinCarouselRight(carouselright);
    }
}
