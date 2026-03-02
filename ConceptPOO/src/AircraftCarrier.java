import java.util.ArrayList;

public class AircraftCarrier {
    public String name;

    public AircraftCarrier(String name) {
        this.name = name;
    }

    ArrayList<Aircraft> aircraftList = new ArrayList<Aircraft>();

    public void addAircraft(Aircraft a) {
        aircraftList.add(a);
    }

    public String launchAircraft(int index) {
        return aircraftList.get(index).takeOff();
    }

    public String[] getAircraftNames() {
        String[] names = new String[aircraftList.size()];
        int index = 0;
        for (Aircraft a : aircraftList) {
            names[index] = a.name;
            index++;
        }
        return names;
    }
}