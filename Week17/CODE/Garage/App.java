package Garage;

public class App {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBoat = new Boat();
        Vehicle myBike = new MotorCycle();

        myCar.stop();

    }

    public static void moveVehicle(Vehicle obj){
        obj.move(10);
    }

}
