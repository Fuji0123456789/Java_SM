package speedmaster.bronze;
/**
 *
 */

class Display6_6C{
	int dispValue(String value) {
		return 10;
	}

	//オーバロード
	int dispValue(long value) {
		return 10;
	}

	//オーバロード
	int dispValue(int value, String str) {
		return 10;
	}
}

public class B6_06C_Overload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display6_6C d=new Display6_6C();

		//d.dispValue(1, "�?");
		System.out.println(d.dispValue(1, ":"));
	}

}
