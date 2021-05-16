package speedmaster.bronze;
/**
 *
 */

interface Inter{
	void disp();
}

class Test1 implements Inter{
	public void disp() {
		System.out.print("Hello");
	}
}

class Test2 extends Test1{
	public void disp() {
		System.out.print("Java");
	}
}

public class B7_16_Polymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Inter obj1;
		Test1 obj2=new Test1();
		Test2 obj3=new Test2();
		obj1=obj3;
		obj1.disp();

		System.out.println(obj2.getClass().getName());
	}

}
