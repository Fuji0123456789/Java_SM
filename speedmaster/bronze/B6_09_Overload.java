package speedmaster.bronze;
/**
 *
 */

public class B6_09_Overload {
	public void dispValue6_9(int num1,int num2) {
		System.out.println("Result = "+num1+num2);
	}

	//オーバロード
	public void dispValue6_9(int num1,int num2,int num3) {
		System.out.println("Result = "+(num1+num2+num3));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B6_09_Overload speedMaster6_9=new B6_09_Overload();
		speedMaster6_9.dispValue6_9(10,30);
		speedMaster6_9.dispValue6_9(10,30,50);
	}

}
