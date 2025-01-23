class Parent11{
	public void m1() {
		System.out.println("-Parent-");
	}
}
class Child11 extends Parent11{
	public void m2() {
		System.out.println("-Child-");
	}
}
class Subchild extends Child11{
	public void m3() {
		System.out.println("-subchild-");
	}
}
public class OOPS2 {
	public static void main(String[] args) {
		Subchild obj = new Subchild();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}