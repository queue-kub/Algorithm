import java.util.Scanner;

public class Ifshape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.print("Enter the base of the triangle: ");
            double base = sc.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = sc.nextDouble();
            System.out.println("Area of the triangle: " + (0.5 * base * height)+" square units");
        } else if (number == 2) {
            System.out.print("Enter your height in kilograms: ");
            double weight = sc.nextDouble();
            System.out.print("Enter your height in meters: ");
            double height = sc.nextDouble();
            System.out.println("Your BMI for weight = " + weight + " kg and height = " + height + " meters is: " + (weight / (height * height)) + "bmi.");
        } else {
            System.out.println();
        }
    }
}