package speedmaster.bronze;
/**
 *
 */

class Employee6_25{
	//int empNo;
	static int empNo;
	static int totalNumOfEmp=500;

	public static void baseSalary(double time,int no) {
		empNo=no;
		System.out.println("empNo : "+no);
		System.out.println("salary : "+1500*time);
	}
}

public class B6_25_static {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Employee6_25.totalNumOfEmp+"people");
		Employee6_25.baseSalary(130.5, 10);
	}

}
/*
500people
empNo : 10
salary : 195750.0
*/