package speedmaster.gold;

class Vehicle{
	private int speed;
	Vehicle(int speed) {
		this.speed=speed;
	}
	int getSpeed(){
		return speed;
	}
}
class Car extends Vehicle{
	private int passenger;
	Car() {
		this(20);
		//super();
		//super(50);
		//passenger=5;
	}
	Car(int speed){
		super(speed);
	}
	public int getPassenger() {
		return passenger;
	}
}

public class G1_04_this_super {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.getSpeed());
	}

}
