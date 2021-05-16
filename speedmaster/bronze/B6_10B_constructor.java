package speedmaster.bronze;
/**
 *
 */

class Apple6_10B{
	private int seeds;

	public Apple6_10B(int seeds){
		this.seeds=seeds;
	}

	public void disp() {
		System.out.println("seeds : "+seeds);
	}
}

public class B6_10B_constructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Apple6_10B apple=new Apple6_10B(5);
		apple.disp();
	}

}
