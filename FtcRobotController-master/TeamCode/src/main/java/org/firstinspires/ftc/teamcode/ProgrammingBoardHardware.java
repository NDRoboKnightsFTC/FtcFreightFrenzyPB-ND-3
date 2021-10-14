package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.RevTouchSensor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ColorSensor;

// Common hardware definitions for Autonomous and TeleOp.
public class ProgrammingBoardHardware {

    public final HardwareMap hwMap;
    public final DcMotor leftFrontMotor;
    public final RevTouchSensor digitalTouch;
    //**TODO public final Servo basicServo;
    //**TODO public final ColorSensor colorSensor;

    public ProgrammingBoardHardware(HardwareMap hwm) {
        hwMap = hwm;

        // Motor
        leftFrontMotor = hwMap.get(DcMotor.class, "lf");
        leftFrontMotor.setDirection(DcMotor.Direction.REVERSE);
        leftFrontMotor.setPower(0);
        leftFrontMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Touch Sensor
        digitalTouch = hwMap.get(RevTouchSensor.class, "digital_touch");

        // Servo
        //**TODO basicServo = hwMap.get(Servo.class, "basic_servo");

        // Color sensor
        //**TODO colorSensor = hwMap.get(ColorSensor.class, "color_sensor");
    }
}