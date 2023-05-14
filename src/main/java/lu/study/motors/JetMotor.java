package main.java.lu.study.motors;

/**
 * The jetmotor (usually for airplanes) inherits the params and methods available in the motor class
 * but it also extends its functionality.
 * This falls into the principle that classes should be open for extension and close for modification.
 */
public class JetMotor extends Motor {

    private Long operationMaxHeight;

    public JetMotor(String name, Double maxSpeed, String model, Long operationMaxHeight) {
        super(name, maxSpeed, model);
        this.operationMaxHeight = operationMaxHeight;
    }


}
