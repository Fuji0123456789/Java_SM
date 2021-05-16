package speedmaster.bronze;
/**
 *
 */

public class B6_22_static {
	private static int i;
	private static int j;

	public static int count() {
		return ++i;
	}
	public int method1() {
		return count();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B6_22_static b6_22_static=new B6_22_static();
		System.out.println(b6_22_static.method1());
		//The static method count() from the type B6_22_static should be accessed in a static wayJava(603979893)
		//System.out.println(b6_22_static.count());
		System.out.println(j);
	}

}
/*
1
2
*/