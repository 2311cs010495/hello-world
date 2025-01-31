public class Demo003 {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 34;
        int num3 =85;
        if (num1 > num2 && num1>num3) {
            System.out.println(num1 + " is greater ");
        } else if( num2> num1 && num2 >num3) {
            System.out.println(num2 + " is greater " );
        }else{
            System.out.println(num3 + " is greater ");
        }
    }
}
