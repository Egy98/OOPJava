import Models.Vehicle;
import Models.Car;
import Models.Moto;

public class Main {
    public static void main(String[] args) {
        Vehicle audi = new Car(240);
        Vehicle triumph = new Moto(220);

        System.out.println("Velocità dell'auto: " + audi.getSpeed() + " km/h");
        System.out.println("Numero di ruote dell'auto: " + audi.getNumberVehicleTires());

        System.out.println("Velocità della motocicletta: " + triumph.getSpeed() + " km/h");
        System.out.println("Numero di ruote della motocicletta: " + triumph.getNumberVehicleTires());
    }
}