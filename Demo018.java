import java.util.Scanner;

public class Demo018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Minutes: ");
        int min=sc.nextInt();
        int year = min/ (365*24*60);
        int day = (min % (365 * 24 * 60)) / (24 * 60);

        System.out.println("Year :"+year+"\nDay :"+day);
        sc.close();

    }
}