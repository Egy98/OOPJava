package Models;

public class Car extends Vehicle{

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public int getNumberVehicleTires() {
        return 4;
    }
}
