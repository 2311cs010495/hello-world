
import java.util.Scanner;

public class Demo045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value [a]:");
        int a = sc.nextInt();
        System.out.println("Enter value [b]:");
        int b = sc.nextInt();
        System.out.println("Value of a before swapping is " + a + " Value of b before swapping is " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a after swapping is " + a + " Value of b after swapping is " + b);
        sc.close();
    }
}
