package speedmaster.bronze;
/**
 *
 */

public class B6_03_object {
	public float printDataA(int num1,float num2) {
		return num1+num2;
	}
	public String printDataB(String var1,int var2) {
		return var1+var2;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B6_03_object speedMaster6_3=new B6_03_object();
		System.out.println("Result = "+speedMaster6_3.printDataA(10, 30.0f));
		System.out.println("Result = "+speedMaster6_3.printDataB("1", 5));
	}

}
