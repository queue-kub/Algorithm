import java.util.Scanner;

public class Numbertest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter a number2 : ");
        int num2 = sc.nextInt();

        int result;
     if (num1 > num2) {
            result = num1 - num2;
        } else {
            result = num1 + num2;
        }
        System.out.println("The result is: " + result);

        sc.close();
    }
}
