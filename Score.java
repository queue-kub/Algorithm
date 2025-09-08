import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your midterm score: ");
        int midterm = sc.nextInt();

        System.out.print("Enter your final score: ");
        int finalScore = sc.nextInt();

        int total = midterm + finalScore;
         if(total >= 50) {
            System.out.println("Your total score is " + total + " . The result is Pass!!");
        } else {
            System.out.println("Your total score is " + total + " . The result is Fail!!");
        }
        sc.close();
    }
}
