public class Demo061 {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}