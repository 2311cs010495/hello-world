public class Demo015 {
    void swap(int a,int b){
        System.out.println("Before swapping of two elements:\na="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping of two elements:\na="+a+" b="+b);

    }
    public static void main(String[] args) {
        Demo015 de=new Demo015();
        de.swap(10,20);
    }
}