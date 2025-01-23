import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		
		//Scanner is used to read data dynamically
		//Scanner is predefined class
		System.out.println("Enter Number :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num%2==0)
			System.out.println("Even !!!");
		else
			System.out.println("Odd !!!");
		

	}

}