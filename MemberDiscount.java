import java.util.Scanner;

public class MemberDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter membership level (Silver, Gold, Platinum): ");
        String memberLevel = sc.nextLine();

        System.out.print("Enter total purchase amount: ");
        double totalPurchase = sc.nextDouble();

        double discountRate;
        if (memberLevel.equalsIgnoreCase("Silver")) {
            discountRate = 0.05;
        } else if (memberLevel.equalsIgnoreCase("Gold")) {
            discountRate = 0.10;
        } else if (memberLevel.equalsIgnoreCase("Platinum")) {
            discountRate = 0.15;
        } else {
            discountRate = 0.0;
        }

        double discount = totalPurchase * discountRate;
        double finalPrice = totalPurchase - discount;

        System.out.println("\n--- Receipt ---");
        System.out.println("Member level: " + memberLevel);
        System.out.println("Total purchase: " + totalPurchase);
        System.out.println("Discount: " + discount);
        System.out.println("Final price: " + finalPrice);

        sc.close();
    }
}
