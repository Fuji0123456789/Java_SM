package speedmaster.bronze;
/**
 *
 */
class Car7_18 {
	public Car7_18() {
		System.out.println("Thi is a vehicle.");
	}
	public Car7_18(int num) {
		System.out.println("This vehicle carries "+num+" people.");
	}
}

class Taxi extends Car7_18{
	public Taxi() {
		super();
		System.out.println("It has a taximeter.");
	}
	public Taxi(int num) {
		//this();
		//super();
		super(num);
	}
}

public class B7_18_super {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car7_18 car=new Taxi(5);
		System.out.println(car.getClass().getName());
	}

}
