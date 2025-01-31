
import java.util.Scanner;

public class Demo035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 > number2) {
            System.out.println("Number1 " + number1 + "is Greater");
        } else {
            System.out.println("Number2 " + number2 + " is Greater ");
        }

        sc.close();
    }
}
