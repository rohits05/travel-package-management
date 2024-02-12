import java.util.*;
import java.io.*;

public class Activity { // Activity class
    private final String name; // Attributes of the activity
    private final String description;
    private final double cost;
    private int remainingCapacity;
    private final Destination destination;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.remainingCapacity = capacity;
        this.destination = destination;
    } // constructor for activity creation

    public String getName() { // method for retrieving the name of the activity
        return name;
    }

    public String getDescription() { // method for retrieving the activity description
        return description;
    }

    public double getCost() { // for retrieving the cost of the activity
        return cost;
    }

    public int getRemainingCapacity() { // for retrieving remaining activity capacity
        return remainingCapacity;
    }

    // Getter method for retrieving the
    public Destination getDestination() { // for activity destination
        return destination;
    }

    public void book(int bookingCount) { // method for booking the activity if needed
        if (bookingCount <= remainingCapacity) {
            remainingCapacity -= bookingCount; // after booking, updating the remaining capacity
            System.out.println("Booking successful for " + bookingCount + " person(s).");
        } else {
            System.out.println("Booking failed. Not enough capacity.");
        }
    }
}
