import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();

        System.out.println("Current -> number1 = " + number1 + " and number2 = " + number2);
        System.out.println("Swapping ............");

        int keep = number1;
        number1 = number2;
        number2 = keep;
        
        System.out.println("Now -> number1 = " + number1 + " and number2 = " + number2);

        scanner.close();
    }
}
