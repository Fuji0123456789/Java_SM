package speedmaster.bronze;
/**
 *
 */

class Employee7_3{
	String name;
	public void func() {
		System.out.println("func");
	}
	public void disp() {
		System.out.println(name);
	}
}

class Sales extends Employee7_3{
	public void disp() {
		System.out.println(name);
	}
}

public class B7_03_Override {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee7_3 emp=new Employee7_3();
		Sales sal=new Sales();

		emp.name="Java";
		sal.name="Duke";

		sal.func();
		sal.disp();
	}

}
