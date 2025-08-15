
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่าน้ำหนักและส่วนสูง
        System.out.print("น้ำหนัก (kg): ");
        double weight = input.nextDouble();

        System.out.print("ส่วนสูง (m): ");
        double height = input.nextDouble();

        // คำนวณ BMI
        double bmi = weight / (height * height);

        // แสดงค่า BMI
        System.out.println("ค่า BMI คือ: " + bmi);
    }
}
