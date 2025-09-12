import java.util.Scanner;

public class NoteChange1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product quantity: ");
        int product = sc.nextInt();

        System.out.print("Enter the product price: ");
        int price = sc.nextInt();
 
        int pay = product * price;
        if(1000 > pay) {
            int change = 1000 - pay;

            System.out.println("Change is : " + change + " baht");

            int fiveHundred = change / 500;
            change = change % 500;

            int hundred = change / 100;
            change = change % 100;

            int fifty = change / 50;
            change = change % 50;

            int twenty = change / 20;
            change = change % 20;

            int ten = change / 10;
            change = change % 10;

            int five = change / 5;
            change = change % 5;

            int two = change / 2;
            change = change % 2;

            System.out.println("Five-hundred note: " + fiveHundred + " note(s)");
            System.out.println("Hundred note: " + hundred + " note(s)");
            System.out.println("Fifty note: " + fifty + " note(s)");
            System.out.println("Twenty note: " + twenty + " note(s)");
            System.out.println("Ten coin: " + ten + " coin(s)");
            System.out.println("Five coin: " + five + " coin(s)");
            System.out.println("Two coin: " + two + " coin(s)");
            System.out.println("One coin: " + change + " coin(s)");
        }
        else {
            System.out.println("Not enough money!!");
        }
        sc.close();
    }
}