package Garage;

public class Car extends Vehicle{
    int numOfWheels = 4;

    @Override
    public void move(double speed) {
        super.move(speed);
        System.out.println("GAS...");
    }

    @Override
    public void stop() {
        System.out.println("OPEN DOORS");
    }

    @Override
    public String toString(){
        return super.toString() + "WHEELS: " + this.numOfWheels;
    }
}
