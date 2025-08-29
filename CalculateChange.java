import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product1, product2, product3;
        double price1, price2, price3, money;
        double total, vat, sum, change;

        System.out.print("Product #1 Name: ");
        product1 = sc.nextLine();
        System.out.print("Product #1 Price: ");
        price1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Product #2 Name: ");
        product2 = sc.nextLine();
        System.out.print("Product #2 Price: ");
        price2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Product #3 Name: ");
        product3 = sc.nextLine();
        System.out.print("Product #3 Price: ");
        price3 = sc.nextDouble();

        System.out.print("Customer paid money: ");
        money = sc.nextDouble();

        System.out.println("----- Receipt -----");

        System.out.printf("%s: %.2f baht\n", product1, price1);
        System.out.printf("%s: %.2f baht\n", product2, price2);
        System.out.printf("%s: %.2f baht\n", product3, price3);

        total = price1 + price2 + price3;
        System.out.printf("Total price before tax: %.2f baht\n", total);

        vat = total * 0.07;
        System.out.printf("VAT = %.2f baht\n", vat);

        sum = total + vat;
        System.out.printf("Net price = %.2f baht\n", sum);

        System.out.printf("Total paid: %.2f baht\n", money);

        change = money - sum;
        System.out.printf("Change = %.2f baht\n", change);

        sc.close();
    }
}
