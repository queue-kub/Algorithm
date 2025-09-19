import java.util.Scanner;

public class TemperatureStatus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperatures: "); 
        int temp = sc.nextInt();

        if (temp < 20) {
            System.out.println("cold");
        } else if (temp <= 35) {
            System.out.println("normal");
        } else {
            System.out.println("Hot");
        }
        sc.close();

    }
}