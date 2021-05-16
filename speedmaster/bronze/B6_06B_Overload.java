package speedmaster.bronze;
/**
 *
 */

class Display{
	int dispValue(String value) {
		return 10;
	}

	//オーバロード
	public int dispValue(long value) {
		return 10;
	}
}

public class B6_06B_Overload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display d=new Display();

		//d.dispValue(1);
		System.out.println(d.dispValue(1));
	}
}
