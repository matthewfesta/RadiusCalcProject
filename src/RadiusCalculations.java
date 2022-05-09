import java.util.Scanner;

/**
 * This class takes an input for the radius and calculates the circumference and
 * area of a circle and the volume of a sphere.
 * @mfesta
 */

public class RadiusCalculations {
    public static void main(String[] args) {
        double radius;
        final double PI = 3.14;
        Scanner in = new Scanner(System.in);

        // Get user input for radius
        System.out.println("Enter the radius: ");
        radius = in.nextDouble();

        // Make Calculations
        double circumference = 2.00 * PI * radius;
        double area = PI * Math.pow(radius, 2);
        double volume = 3.00/4.00 * PI * Math.pow(radius, 3);

        // Output results
        System.out.printf("The circumference of a circle with a radius of %.3f is %.5f\n", radius, circumference);
        System.out.printf("The area of a circle with a radius of %.3f is %.5f\n", radius, area);
        System.out.printf("The volume of a sphere with a radius of %.3f is %.5f\n", radius, volume);
    }
}
