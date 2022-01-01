package Garage;

public class Boat extends Vehicle{

    @Override
    public void move(double speed) {
        System.out.println("CHECKING WATER TEMP");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
