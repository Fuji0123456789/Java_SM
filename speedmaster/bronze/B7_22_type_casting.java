package speedmaster.bronze;
/**
 *
 */

class Tea{
	String flavor;
}

public class B7_22_type_casting extends Tea{
	B7_22_type_casting(String flavor){
		this.flavor=flavor;
	}
	void addFlavor() {
		System.out.println("Add: "+flavor);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tea tea=new B7_22_type_casting("Milk");
		((B7_22_type_casting)tea).addFlavor();
	}

}
