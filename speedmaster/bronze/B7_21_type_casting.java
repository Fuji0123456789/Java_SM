package speedmaster.bronze;
/**
 *
 */

class Coffee{
	void drip() {
		System.out.println("Coffee");
	}
}

public class B7_21_type_casting extends Coffee{
	void addMilk(){
		System.out.println("CoffeeMocha");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coffee cof=new Coffee();
		B7_21_type_casting moc=(B7_21_type_casting)cof;
		System.out.println(moc.getClass().getName());
	}

}
