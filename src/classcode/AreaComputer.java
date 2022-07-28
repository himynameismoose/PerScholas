package classcode;

public class AreaComputer {
    /** Main method */
    public static void main(String[] args) {
        // Declare - type, name
        double radius;
        double area;
        final double PI = 3.14159;

        // Assign a value to the radius:
        radius = 20;

        // Compute area:
        area = radius * radius * PI;

        // Display results:
        System.out.println("The area for the circle of radius " +
                radius + " is " + area); // String concatenation
    }
}
