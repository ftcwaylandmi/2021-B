package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;


public class Robot {
    RobotHardware myself = new RobotHardware();
    double CarouselSpeed = 1;
    boolean running = false;

    public void initHW(HardwareMap ahwMap) {
        myself.init(ahwMap);
    }

  public void Drive(double s) {
      myself.leftfrontDrive.setPower(s);
      myself.rightfrontDrive.setPower(s);
      myself.leftbackDrive.setPower(s);
      myself.rightbackDrive.setPower(s);
  }

  public void StopDrive() {
        myself.leftfrontDrive.setPower(0);
        myself.rightfrontDrive.setPower(0);
        myself.leftbackDrive.setPower(0);
        myself.rightfrontDrive.setPower(0);
  }

  public void SpinRight (double s) {
        myself.leftfrontDrive.setPower(s);
        myself.rightfrontDrive.setPower(-s);
        myself.leftbackDrive.setPower(s);
        myself.rightbackDrive.setPower(-s);
    }

    public void SpinLeft(double s) {
        myself.leftfrontDrive.setPower(-s);
        myself.rightfrontDrive.setPower(s);
        myself.leftbackDrive.setPower(-s);
        myself.rightbackDrive.setPower(s);
    }

    public void RightDrive(double s) {
        myself.leftfrontDrive.setPower(s);
        myself.rightfrontDrive.setPower(0);
        myself.leftbackDrive.setPower(s);
        myself.rightbackDrive.setPower(0);
    }

    public void LeftDrive(double s) {
        myself.leftfrontDrive.setPower(0);
        myself.rightfrontDrive.setPower(s);
        myself.leftbackDrive.setPower(0);
        myself.rightbackDrive.setPower(s);
    }

    public void SpinCarouselLeft(){
        myself.spinMotor.setPower(CarouselSpeed);
        running = true;
    }

    public void StopCarousel(){
        myself.spinMotor.setPower(0);
    }

    public void SpinCarouselRight(){
        myself.spinMotor.setPower(-CarouselSpeed);
        running = true;

    }

}