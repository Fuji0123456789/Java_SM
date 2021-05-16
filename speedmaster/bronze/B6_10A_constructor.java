package speedmaster.bronze;
/**
 *
 */

class Apple6_10A{
	private int seeds;

	Apple6_10A(int seeds){
		this.seeds=seeds;
	}

	public void disp() {
		System.out.println("seeds : "+seeds);
	}
}

public class B6_10A_constructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Apple6_10A apple=new Apple6_10A(5);
		apple.disp();
	}

}
