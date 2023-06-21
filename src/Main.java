import Models.CArClass;

public class Main
{
    public static void main(String[] args)
    {
       /* CArClass audi = new CArClass();
        audi.setManufacturing("audi");
        audi.setModel("RS3 ABT");
        audi.setYear(2023);

        System.out.println("Casa madre : " + audi.getManufacturing());
        System.out.println("Modello : " + audi.getModel());
        System.out.println("Anno : " + audi.getYear());
        */

        CArClass car = new CArClass("Toyota", "Yaris GR", 2023);

        System.out.println("Modello : "  + car.Model );
        System.out.println("Casa madre : " + car.Manufacturing);
        System.out.println("Anno : " + car.Year);


    }
}