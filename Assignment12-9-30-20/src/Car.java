public class Car extends Vehicle {
    private int numberOfDoors;
    private int numberOfWheels;
    private boolean isAutomatic;

    public Car(String make, String model, int topSpeed) {
        super(make, model, topSpeed);
    }

    public Car(String make, String model, int topSpeed, int numberOfDoors, int numberOfWheels, boolean isAutomatic) {
        super(make, model, topSpeed);
        this.numberOfDoors = numberOfWheels;
        this.numberOfWheels = numberOfDoors;
        this.isAutomatic = true;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
}
