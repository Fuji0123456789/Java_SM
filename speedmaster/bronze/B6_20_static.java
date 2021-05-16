package speedmaster.bronze;
/**
 *
 */

class Employee{

	//static変数
	static int totalNumOfEmp=500;

	//staticメソッド
	public static double baseSalary(double time) {
		return 1500*time;
	}
}

public class B6_20_static {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Employee.totalNumOfEmp+"people");
		System.out.println(Employee.baseSalary(160.5)+"yen");
	}

}
/*
500people
240750.0yen
*/