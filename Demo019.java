import java.util.Scanner;

public class Demo019 {
    public static void main(String[] args) {
        Demo019 demo = new Demo019();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = sc.nextInt();

        int[] fibSequence = demo.fibonacci(n);

        System.out.println("Fibonacci Sequence:");
        for (int num : fibSequence) {
            System.out.print(num + " ");
        }

        sc.close();

    }
    int[] fibonacci(int n){
        int[] result=new int[n];
        if (n > 0) {
            result[0] = 0; 
        }
        if (n > 1) {
            result[1] = 1; 
        }
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2]; 
        }
        return result;
        
    }
}