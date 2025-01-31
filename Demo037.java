
import java.util.Scanner;

public class Demo037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Four numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        if (number1 > number2 && number1 > number3 && number1 > number4) {
            System.out.println("Number1 " + number1 + "is Greater");
        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            System.out.println("Number2 " + number2 + " is Greater ");
        } else if (number3 > number1 && number3 > number2 && number3 > number4) {
            System.out.println("Number3" + number3 + "is Greater");
        } else {
            System.out.println("Number" + number4 + "is greater");
        }

        sc.close();
    }
}
