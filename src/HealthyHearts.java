import java.util.Scanner;

class HealthyHearts {
    public static void main(String[] args) {

        System.out.println("Health Calculator");

        // Scanner object
        Scanner scan = new Scanner(System.in);

        //Ask user for age and hold value in userAge
        System.out.println("What is your age?");
        int userAge = scan.nextInt();

        // Formula finding maximum heart rate
        int maxHeartRate = 220 - userAge;
        System.out.println("Your maximum heart rate should be " +maxHeartRate+ " beats per minute");

        // Calculating 50 and 80 % of maximum heart rate
        double targetHeartRateLow = 0.50 * maxHeartRate;
        double targetHeartRateHigh = 0.85 * maxHeartRate;

        // cast to integer and round results
        int zoneLowRange = (int )Math.round(targetHeartRateLow);
        int zoneHighRange = (int) Math.round(targetHeartRateHigh);

        //Print message
        System.out.println("Your target HR Zone is " + zoneLowRange + " - " + zoneHighRange + " beats per minute");



    }
}