import java.util.*;

public class PassengerList {

    // passengers enrolled in a travel package
    public static void printDetail(String packageName, int passengerCapacity, ArrayList<Passenger> passengers) {
        // printing package name and capacity
        System.out.println("Travel Package Name: " + packageName);
        System.out.println("Passenger Capacity of Package: " + passengerCapacity);

        // printing number of passengers currently enrolled
        System.out.println(
                passengers.size() + " number of passengers currently enrolled, and their details are as follows:");

        // iterating through each passenger, details
        for (Passenger passenger : passengers) {
            System.out.println("Passenger Name: " + passenger.getName() +
                    ", Passenger Number: " + passenger.getNumber());
        }
    }
}