package Models;

public class Inventory
{
    String id;
    String name;
    double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Inventory (String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double som ()
    {
        double somma = (double) price;
        return somma;
    }
}
