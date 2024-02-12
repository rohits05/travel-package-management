import java.io.*;
import java.util.*;

interface InnerPassenger { // Interface for passenger details
    void printDetail();
}

public class Passenger implements InnerPassenger {
    final String name;
    final int passengerNumber;
    final String passengerType; // Attributes of a Passenger
    double balance; // zero for premium type
    ArrayList<Activity> signedActivities;

    static int nextpassengerNumber = 0; // for generating passenger numbers sequentially

    public Passenger(String name, String passengerType, double balance) {
        this.name = name;
        this.passengerNumber = ++nextpassengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        this.signedActivities = new ArrayList<>();
    }

    public void signUpForActivity(Activity activity) {
        signedActivities.add(activity);
    } // activity signup

    public String getName() {
        return name;
    } // for passengers name

    public int getNumber() {
        return passengerNumber;
    } // for passengers number

    public String getType() {
        return passengerType;
    } // for passengers type

    // details of a passenger
    @Override
    public void printDetail() {
        System.out.println("Name of Passenger: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        System.out.println("Remaining Balance: " + balance);
        System.out.println("Signed Activities: " + signedActivities.size());

        for (Activity activity : signedActivities) {
            System.out.println("Activity Name: " + activity.getName());
            System.out.println("Destination Name: " + activity.getDestination().getName());
            double costPaid = activity.getCost();

            if (passengerType.equals("gold"))
                costPaid *= 0.9;
            if (passengerType.equals("premium"))
                costPaid = 0.0; // Premium passengers benefit
            System.out.println("Price paid by passenger: " + costPaid);
        }
    }
}
