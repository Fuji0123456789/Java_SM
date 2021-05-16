package speedmaster.bronze;
/**
 *
 */

public class B3_01_Increment_Decrement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=5;
		int b=6;

		int x=++a;		//a=5+1=6	x=a=6
		int y=b++;		//y=b=6		b=6+1=7

		x=y++;			//x=y=6		y=6+1=7
		y=x++;			//y=x=6		x=6+1=7

		System.out.println("x:"+x+" y:"+y);
	}

}
