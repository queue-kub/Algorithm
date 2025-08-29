import java.util.Scanner;

public class BuyProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Product #1 name: ");
        String product1 = scanner.nextLine();
        System.out.print("Product #1 price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();  

        System.out.print("Product #2 name: ");
        String product2 = scanner.nextLine();
        System.out.print("Product #2 price: ");
        double price2 = scanner.nextDouble();
        scanner.nextLine();  

        System.out.print("Product #3 name: ");
        String product3 = scanner.nextLine();
        System.out.print("Product #3 price: ");
        double price3 = scanner.nextDouble();

        System.out.print("Customer paid money: ");
        double totalPaid = scanner.nextDouble();  

        
        double totalBeforeTax = price1 + price2 + price3;
        double vat = totalBeforeTax * 0.07;
        double netprice = totalBeforeTax + vat;
        double change = totalPaid - netprice;  


        System.out.println("\n---- Receipt ----");
        System.out.printf("%s: %.2f baht\n", product1, price1);
        System.out.printf("%s: %.2f baht\n", product2, price2);
        System.out.printf("%s: %.2f baht\n", product3, price3);
        System.out.printf("Total price before tax: %.2f baht\n", totalBeforeTax);
        System.out.printf("VAT = %.2f baht\n", vat);
        System.out.printf("Net price = %.2f baht\n", netprice);
        System.out.printf("Total paid: %.2f baht\n", totalPaid);
        System.out.printf("Change = %.2f baht\n", change);

        scanner.close();
    }
}
