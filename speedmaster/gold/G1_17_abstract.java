package speedmaster.gold;

public class G1_17_abstract {

	public static void main(String[] args) {
		Flyer b1 = new Bird();
		Bird b2 = new Bird();
		System.out.println(b1.up()+b2.up());
	}

}
abstract class Flyer{
	public abstract String up();
}
class Bird extends Flyer{
	@Override
	public String up() {
		return "Bird Up!";
	}
}
/*
Bird Up!Bird Up!

*/