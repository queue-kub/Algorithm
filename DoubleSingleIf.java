import java.util.Scanner;

public class DoubleSingleIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        long number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number "+number+" is Even");
        }
        else {
            System.out.println("The number "+number+" is odd");
        }
        

    }
}
