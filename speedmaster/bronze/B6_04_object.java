package speedmaster.bronze;
/**
 *
 */

class Car{
	int petrol;
	void setPetrol(int amount) {
		petrol=amount;
	}
	void printPetrol() {
		System.out.println("Amount of petrol = "+petrol);
	}
}

public class B6_04_object {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car=new Car();
		car.setPetrol(0);
		car.petrol=10;
		car.printPetrol();
	}

}
