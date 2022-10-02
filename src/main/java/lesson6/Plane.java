package lesson6;

public class Plane implements Flying, Printable{

    static private long count = 0;

    private long id;
    private String manufacturer;
    private String model;
    private double speedMph;

    public Plane() {
        manufacturer = "";
        model = "";
        count += 1000;
        id = count;
    }

    public Plane(String manufacturer, String model, double speedMph) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.speedMph = speedMph;
        count += 1000;
        id = count;
    }

    @Override
    public double travel(double time) {
        return time * speedMph * MPH_TO_KMH;
    }

    @Override
    public void Print() {
        System.out.println("Plane: " + manufacturer + " " + model + "; speed: " + speedMph * MPH_TO_KMH + "; id:" + id);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeedMph() {
        return speedMph;
    }

    public void setSpeedMph(double speedMph) {
        this.speedMph = speedMph;
    }
}
