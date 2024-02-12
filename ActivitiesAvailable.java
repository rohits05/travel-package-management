import java.util.*;
import java.io.*;

public class ActivitiesAvailable {

    // for details of activities that still have available space
    public static void printDetail(ArrayList<Destination> itinerary) {

        System.out.println("Activities that still have space available:");

        // iterating through the itinerary
        for (Destination destination : itinerary) {
            // iterating through each destination activities
            for (Activity activity : destination.getActivities()) {
                // checks if available space
                if (activity.getCapacity() > 0) {
                    System.out.println("Name of Activity: " + activity.getName()
                            + ", Available Spaces: " + activity.getCapacity());
                }
            }
        }
    }
}
