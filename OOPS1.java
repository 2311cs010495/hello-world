class Parent1{
	int x = 200;
}
class Child1 extends Parent1{
	int y = 100;
}
public class OOPS1 {
	public static void main(String[] args) {
		Child1 obj = new Child1();
		int num1 = obj.x;
		int num2 = obj.y;
		System.out.println(num1);
		System.out.println(num2);
	}
}