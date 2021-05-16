package speedmaster.bronze;
/**
 *
 */

class Fruit{
	Fruit(){
		System.out.println("Fruit");
	}
	Fruit(String msg){
		System.out.println("Fruit with msg.");
	}
}

public class B7_19_super extends Fruit{
	B7_19_super(){
		System.out.println("Apple");
	}
	B7_19_super(String msg){
		System.out.println("Apple with msg");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B7_19_super apl=new B7_19_super("for healh");
		System.out.println(apl.getClass().getName());
	}

}
