import java.util.Scanner;

public class SingleIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number = ");
        long number = scanner.nextInt();

        if (number > 0 ) {
            System.out.println("จำนวนเต็ม");
        }
        System.out.println("จบโปรแกรม");

    }
}
