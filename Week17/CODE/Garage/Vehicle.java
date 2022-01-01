package Garage;

public class Vehicle {
    // WHAT IT HAS?
    private double speed;
    private String color;
    private String plate;

    // WHAT IT DOES?
    public void move(double speed){
        this.speed = speed;
        System.out.println("MOVING AT " + speed + " KM/H");
    }

    public void stop(){
        this.speed = 0;
        System.out.println("STOP");
    }

    @Override
    public String toString() {
        return "COLOR:" + this.color + " SPEED: " + this.speed;
    }
}
