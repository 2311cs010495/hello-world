
import java.util.Scanner;

public class Demo042 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char lowerChar = scanner.next().charAt(0);
        if (Character.isLowerCase(lowerChar)) {
            char upperChar = Character.toUpperCase(lowerChar);
            System.out.println("The uppercase character is: " + upperChar);
        } else {
            System.out.println("The input is not a lowercase letter.");
        }
        scanner.close();
    }
}
