import java.lang.reflect.Array;
import java.util.ArrayList;

public class Department {
    private String name;
    private int numberOfInstruments = 0;
    private ArrayList<Instrument> instruments = new ArrayList<>();


    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addInstrument(Instrument instruments) {
        numberOfInstruments++;
        this.instruments.add(instruments);

    }

    public int getNumberOfInstruments() {
        return numberOfInstruments;
    }

    public void setName(String name) {
        this.name = name;
    }
}


