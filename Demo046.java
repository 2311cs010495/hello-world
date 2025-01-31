
import java.util.Scanner;

public class Demo046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int Year = sc.nextInt();
        if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
            System.out.println(Year + " is a leap Year");
        } else {
            System.out.println(Year + " is not a Leap Year");
        }
        sc.close();
    }
}
