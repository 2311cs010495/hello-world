class Parent111{
	int num1 = 100;
	
}
class Child111 extends Parent111{
	int num2 = 50;
	
}
class Child222 extends Parent111{
	int num2 = 25;
}
public class OOPS3 {
	public static void main(String[] args) {
		Child111 obj1 = new Child111();
		System.out.println(obj1.num1 + obj1.num2);
		
		Child222 obj2 = new Child222();
		System.out.println(obj2.num1 + obj2 .num2);
	}
}