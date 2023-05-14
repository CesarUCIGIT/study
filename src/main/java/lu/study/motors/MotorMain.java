package main.java.lu.study.motors;

import java.sql.SQLOutput;

public class MotorMain {

    public static void main(String[]args){
        //the compiler understands that both of these even if coming from different implemeting classes are motors
        Motor jetMotor = new JetMotor("pratt&whitney", 835.6, "20231222", 30L);
        Motor carMotor = new CarMotor("volkswagen", 200.0, "2023", 25L);

        System.out.println(jetMotor.getBrand());
        System.out.println(carMotor.getBrand());

        //it also understands that they are diff objects
        System.out.println(jetMotor.equals(carMotor));

        //using inheritance prevents from writing the same code twice



    }
}
