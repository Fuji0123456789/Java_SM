package speedmaster.bronze;
/**
 *
 */

interface Player{
	void play();
}

class CDPlayer implements Player{
	public void play() {
		System.out.println("Play CD");
	}
}

public class B7_10_interface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CDPlayer cDPlayer=new CDPlayer();
		cDPlayer.play();
	}

}
