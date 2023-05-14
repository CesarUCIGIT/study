package main.java.lu.study.motors;

public class CarMotor extends Motor {

    private Long torque;

    public CarMotor(String name, Double maxSpeed, String model, Long torque) {
        super(name, maxSpeed, model);
        this.torque = torque;
    }

    public Long getTorque() {
        return torque;
    }

    public void setTorque(Long torque) {
        this.torque = torque;
    }
}
