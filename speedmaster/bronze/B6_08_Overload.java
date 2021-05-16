package speedmaster.bronze;
/**
 *
 */

public class B6_08_Overload {
	public double dispValue(int num1,double num2) {
		return num1+num2;
	}

	//オーバロード
	public String dispValue(String var1,String var2) {
		return var1+var2;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B6_08_Overload dis=new B6_08_Overload();
		System.out.println("Result = "+dis.dispValue(5,20.0));
		System.out.println("Result = "+dis.dispValue("1","5"));
	}

}
