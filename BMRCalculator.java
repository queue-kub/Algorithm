import java.util.Scanner;

public class BMRCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your gender (male/female): ");
        String gender = sc.nextLine().toLowerCase();

        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        double bmr;
        if (gender.equals("male")) {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else if (gender.equals("female")) {
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        } else {
            System.out.println("Invalid gender entered.");
            sc.close();
            return;
        }
        System.out.printf("Your BMR is: %.2f calories/day\n", bmr);

        sc.close();
    }
}
