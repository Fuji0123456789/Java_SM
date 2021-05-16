package speedmaster.bronze;

class Employee7_7{
	void disp() {
		System.out.print("Employee work");
	}
}

public class B7_07_Override extends Employee7_7{
	public void disp() {
		System.out.print("Manager manage");
	}

	public static void main(String[] args) {
		B7_07_Override speedMaster7_7=new B7_07_Override();
		speedMaster7_7.disp();
	}

}
