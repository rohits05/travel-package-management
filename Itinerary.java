import java.util.*;
import java.io.*;

// Itinerary class
public class Itinerary {

    // method for printing itinerary details
    public static void printDetail(String packageName, ArrayList<Destination> itinerary) {
        // printing package name
        System.out.println("Travel Package Name: " + packageName);

        // iterating through each destination in the itinerary
        for (Destination destination : itinerary) {
            System.out.println("Name of Destination: " + destination.getName());

            // printing destination activities
            destination.printActivities();
        }
    }
}