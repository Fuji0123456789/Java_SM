package speedmaster.gold;

class Employee{
	private int empNo;
	//int empNo;
	//public int empNo;
	public String empName;
	public Employee(int empNo,String empName) {
		this.empNo=empNo;
		this.empName=empName;
	}
	public void disp() {
		System.out.println("NO  :"+empNo);
		System.out.println("NAME:"+empName);
	}
}

public class G1_02_private {

	public static void main(String[] args) {
		Employee c1=new Employee(100, "Duke");
		//private修飾子の指定されたメンバには他のクラスからアクセスすることができない。	
		//c1.empNo=123;
		c1.disp();
	}

}
