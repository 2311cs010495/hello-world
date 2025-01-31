
import java.util.Scanner;

public class Demo036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("Number1 " + number1 + "is Greater");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Number2 " + number2 + " is Greater ");
        } else {
            System.out.println("Number3" + number3 + "is Greater");
        }

        sc.close();
    }
}
