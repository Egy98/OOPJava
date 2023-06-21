package Models;

public class CArClass
{
    private String Model;
    protected String Manufacturing;
    public int Year;

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getManufacturing() {
        return Manufacturing;
    }

    public void setManufacturing(String manufacturing) {
        Manufacturing = manufacturing;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public CArClass (String Model, String Manufacturing, int Year) {
        this.Model = Model;
        this.Manufacturing = Manufacturing;
        this.Year = Year;
    }
}
