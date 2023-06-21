package Models;

public class Moto extends Vehicle{

    public Moto(int speed) {
        this.speed = speed;
    }

    @Override
    public int getNumberVehicleTires() {
        return 2;
    }
}
