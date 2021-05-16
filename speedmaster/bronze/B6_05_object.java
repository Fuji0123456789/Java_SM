package speedmaster.bronze;
/**
 *
 */

class CarA{
	int petrol;
	void setPetrol(int amount) {
		petrol=amount;
	}
	void printPetrol() {
		System.out.print(petrol+"");
	}
}

public class B6_05_object {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarA car1=new CarA();
		CarA car2=new CarA();
		CarA car3=car2;
		car1.setPetrol(10);
		car2.setPetrol(20);
		car3.setPetrol(30);
		car1.printPetrol();
		car2.printPetrol();
		car3.printPetrol();
	}
}
