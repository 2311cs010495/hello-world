public class Demo064 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        if (arr.length > 1) {  
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        System.out.println("Array after swapping first and last elements:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
