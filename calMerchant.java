import java.util.Scanner;

public class calMerchant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับราคาสินค้าต่อหน่วย
        System.out.print("Enter the price of the product (per unit): ");
        double price = scanner.nextDouble();

        // รับจำนวนสินค้า
        System.out.print("Enter the quantity of the product: ");
        int quantity = scanner.nextInt();

        // คำนวณราคารวม
        double total = price * quantity;

        // ตรวจสอบเงื่อนไขลดราคา
        if (quantity > 10) {
            System.out.println("You get a 10% discount!");
            total = total * 0.90; // ลด 10%
        }

        // แสดงราคารวม
        System.out.println("Total price: " + total + " Baht");

        scanner.close();
    }
}
