class Parent12{
	public void dbConn() {
		System.out.println("data from oracle soon....!");
	}
}
class Child12 extends Parent12{
	public void dbConn() {
		System.out.println("data from mongodb soon....!");
	}
}
public class OOPS5 {
	public static void main(String[] args) {
		Child12 obj = new Child12();
		obj.dbConn();
	}
}