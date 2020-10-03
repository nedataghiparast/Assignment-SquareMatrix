public class Vehicle {
    private String make;
    private String model;
    private int topSpeed;

    public Vehicle(String make, String model, int topSpeed) {
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
