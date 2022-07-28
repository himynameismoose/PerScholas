package classcode;

import java.util.Scanner;

public class AreaComputer2 {
    /** Main method */
    public static void main(String[] args) {
        // Declare - type, name
        double radius;
        double area;
        final double PI = 3.14159;

        // Assign a value to the radius:
        radius = 20;

        Scanner input = new Scanner(System.in); // Create a Scanner
        System.out.println("Please enter the radius: ");
        radius = input.nextDouble();

        // Compute area:
        area = radius * radius * PI;

        // Display results:
        System.out.println("The area for the circle of radius " +
                radius + " is " + area); // String concatenation
    }
}
