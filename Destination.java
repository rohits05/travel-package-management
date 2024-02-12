import java.util.*;
import java.io.*;

// interface for activities of a destination
interface InnerDestination {
    void printActivities();
}

public class Destination implements InnerDestination {
    private final String name;
    private final ArrayList<Activity> activities;

    public Destination(String name, ArrayList<Activity> activities) {
        this.name = name;
        this.activities = activities;
    }

    public String getName() { // getting name of the destination
        return name;
    }

    public ArrayList<Activity> getActivities() { // getting activities of the destination
        return activities;
    }

    // details of activities at the destination
    @Override
    public void printActivities() {
        System.out.println("Activities at " + name + ":");
        for (Activity activity : activities) {
            System.out.println("Activity Name: " + activity.getName() +
                    "\nDescription: " + activity.getDescription() +
                    "\nCost: " + activity.getCost() +
                    ", Capacity: " + activity.getCapacity());
        }
    }
}
