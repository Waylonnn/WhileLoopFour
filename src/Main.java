import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;
        boolean valid = false;
        String buffer = "";
        double meters = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter meter measurement: ");
            if(scan.hasNextDouble()){
                meters = scan.nextDouble();
                scan.nextLine();
                if(meters > 0)
                    valid = true;
                else System.out.println("You have entered an invalid meter measurement. Please try again.");

            } else{
                scan.nextLine();
                System.out.println("You must enter a number.");
            }
        } while (!valid);
        System.out.printf("Meters: %.2f\n", meters);
        System.out.printf("Miles: %.2f\n", meters*METERS_TO_MILES);
        System.out.printf("Feet:  %.2f\n", meters*METERS_TO_FEET);
        System.out.printf("Inches: %.2f\n", meters*METERS_TO_INCHES);
    }
}