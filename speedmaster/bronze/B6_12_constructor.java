package speedmaster.bronze;
/**
 *
 */

class Apple6_12{
	int seeds;
	public Apple6_12(int seeds) {
		this.seeds=seeds;
	}
	public void setSeeds(int seeds) {
		this.seeds=seeds;
	}
	public void print() {
		System.out.print("This apple has" + seeds + "seeds.");
	}
}

public class B6_12_constructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Apple6_12 apl1=new Apple6_12();
		Apple6_12 apl2=new Apple6_12(10);
		//apl1.print();
		//apl1.setSeeds(10);
		apl2.print();
	}

}
