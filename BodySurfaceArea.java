
import java.util.Scanner;

public class BodySurfaceArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ประกาศตัวแปรและรับค่า
        System.out.print("Enter width (wide): ");
        double wide = input.nextDouble();

        System.out.print("Enter length (long): ");
        double longValue = input.nextDouble(); // ใช้ชื่อ longValue เพราะ "long" เป็น keyword ใน Java

        // คำนวณ body surface area
        double bodySurfaceArea = (wide * longValue) / 360;

        // แสดงผล
        System.out.println("Body Surface Area = " + bodySurfaceArea);
    }
}
