package speedmaster.bronze;
/**
 *
 */

public class B6_23_static {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Count c1=new Count();
		Count c2=new Count();
		c1.add();
		c2.add();
		c1.disp();
		c2.disp();
	}

}

class Count{
	private static int i;
	private int j;

	public void add() {
		i++;
		j++;
	}
	public void disp() {
		System.out.println(i+" : "+j);
	}
}
/*
2 : 1
2 : 1
*/