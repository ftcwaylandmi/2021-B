package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class RobotHardware {

    public DcMotor leftfrontDrive = null;
    public DcMotor rightfrontDrive = null;
    public DcMotor leftbackDrive = null;
    public DcMotor rightbackDrive = null;
    public DcMotor beltMotor = null;
    public DcMotor feederMotor = null;
    public DcMotor spinMotor = null;
    public DcMotor armMotor = null;
    public Servo handServo = null;
    public Servo pushServo = null;

    HardwareMap hwMap = null;

    public RobotHardware () {

    }

    public void init(HardwareMap ahwMap)  {
        hwMap = ahwMap;

        leftfrontDrive = hwMap.get(DcMotor.class, "lfd");
        rightfrontDrive = hwMap.get(DcMotor.class, "rfd");
        leftbackDrive = hwMap.get(DcMotor.class,"lbd");
        rightbackDrive = hwMap.get(DcMotor.class,"rbd");
        beltMotor = hwMap.get(DcMotor.class,"bm");
        feederMotor = hwMap.get(DcMotor.class,"fm");
        spinMotor = hwMap.get(DcMotor.class,"sm");
        armMotor = hwMap.get(DcMotor.class,"am");
        handServo = hwMap.get(Servo.class,"hs");
        pushServo = hwMap.get(Servo.class,"ps");
        leftfrontDrive.setDirection(DcMotor.Direction.FORWARD);
        rightfrontDrive.setDirection(DcMotor.Direction.REVERSE);
        leftbackDrive.setDirection(DcMotor.Direction.FORWARD);
        rightbackDrive.setDirection(DcMotor.Direction.REVERSE);
        beltMotor.setDirection(DcMotor.Direction.FORWARD);
        feederMotor.setDirection(DcMotor.Direction.FORWARD);
        spinMotor.setDirection(DcMotor.Direction.FORWARD);
        armMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        handServo.setDirection(Servo.Direction.FORWARD);
        pushServo.setDirection(Servo.Direction.FORWARD);
        leftfrontDrive.setPower(0);
        rightfrontDrive.setPower(0);
        leftbackDrive.setPower(0);
        rightbackDrive.setPower(0);
        spinMotor.setPower(0);
    }
}