package speedmaster.bronze;
/**
 *
 */

class Employee7_4{
	int num;
	private String name;
	protected int age;

	Employee7_4(String name,int num){
		this.name=name;
		this.num=num;
	}

	public void disp() {
		System.out.println(name);
		System.out.println(num);
	}
}

class Engineer extends Employee7_4{
	Engineer(String name, int num) {
		super(name, num);
		System.out.println(age);
	}
	int a=num;
	//String b=name;
	int c=age;
	public void disp(){
		//System.out.println(name);
		System.out.println(num);
	}
}

public class B7_04_AccessModifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Engineer engineer=new Engineer("縺?", 1);
		engineer.disp();

	}

}
