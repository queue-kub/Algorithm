import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ประกาศและรับค่า Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = input.nextDouble();

        // คำนวณ Celsius
        double celsius = (5.0 / 9) * (f - 32);

        // แสดงผลลัพธ์
        System.out.println("Temperature in Celsius = " + celsius);
    }
}
