package speedmaster.bronze;
/**
 *
 */

public class B6_24_static {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1="Hello";
		str1=method1(str1);
		System.out.print(str1);
	}

	static String method1(String str2) {
		return str2+"Java";
	}
}
/*
HelloJava
*/