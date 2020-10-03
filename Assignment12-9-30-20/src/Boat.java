public class Boat extends Vehicle {
    private boolean hasSonarGPS;
    private int numberOfMotor;

    public Boat(String make, String model, int topSpeed) {
        super(make, model, topSpeed);
    }

    public Boat(String make, String model, int topSpeed, boolean hasSonarGPS, int numberOfMotor) {
        super(make, model, topSpeed);
        this.hasSonarGPS = hasSonarGPS;
        this.numberOfMotor = numberOfMotor;

    }

    public boolean isHasSonarGPS() {
        return hasSonarGPS;
    }

    public void setHasSonarGPS(boolean hasSonarGPS) {
        this.hasSonarGPS = hasSonarGPS;
    }

    public int getNumberOfMotor() {
        return numberOfMotor;
    }

    public void setNumberOfMotor(int numberOfMotor) {
        this.numberOfMotor = numberOfMotor;
    }
}

