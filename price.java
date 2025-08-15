
import java.util.Scanner;

public class price {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("Enter price of one dress: ");
        double bath = input.nextDouble();

        System.out.print("Enter number of dresses to buy: ");
        int num = input.nextInt();

        System.out.print("Enter discount rate: ");
        double modulo = input.nextDouble();

        // คำนวณราคาทั้งหมด
        double totalCost = bath * num;

        // คำนวณส่วนลด
        double DA = totalCost * (modulo / 5);

        // คำนวณราคาสุทธิ
        double netPay = totalCost - DA;

        // แสดงผลลัพธ์
        System.out.println("-----------------------------------------");
        System.out.println("Total cost = " + totalCost + " Baht");
        System.out.println("discountAmount = " + DA + " Baht");
        System.out.println("Net Pay = " + netPay + " Baht");
    }
}
