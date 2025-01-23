import java.util.Scanner;

public class AddElementsDynamically {

	public static void main(String[] args) {
		System.out.print("enter array length :");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("enter array element for "+i+"th position:");
			arr[i] = scanner.nextInt();
		}
		
		//display array
		for(int element:arr) {
			System.out.print(element+" ");
		}
	}

}