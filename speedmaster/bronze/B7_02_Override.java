package speedmaster.bronze;

class Parent{
	static	String message;
	public void disp() {
		System.out.println("Parent : "+message);
	}
}

class Child extends Parent{
	public /*static*/ void disp() {
		System.out.println("Child : "+message);
	}
}

public class B7_02_Override {

	public static void main(String[] args) {
		Parent parent=new Parent();
		Child child=new Child();

		//parent.message="message A";
		Parent.message="message A";
		//child.message="message B";
		Parent.message="message B";

		parent.disp();
		child.disp();
	}

}
/*
Parent : message B
Child : message B
*/