import java.util.*;
import java.io.*;

// Travel package class
public class TravelPackage {
    final String name;
    final int passengerCapacity;
    final ArrayList<Destination> itinerary;
    final ArrayList<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity, ArrayList<Destination> itinerary) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = itinerary;
        this.passengers = new ArrayList<>();
    } // constructor for creating a travel package

    // method for printing the itinerary of the travel package
    public void printItinerary() {
        Itinerary.printDetail(name, itinerary);
    }

    // method for printing the list of passengers in the travel package
    public void printPassengerList() {
        PassengerList.printDetail(name, passengerCapacity, passengers);
    }

    // Method for printing the details of available activities in the travel package
    public void printAvailableActivities() {
        AvailableActivities.printDetail(itinerary);
    }
}
