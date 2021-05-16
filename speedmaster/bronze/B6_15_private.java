package speedmaster.bronze;
/**
 *
 */

class Camera{

}

class DigitalCamera extends Camera{
	private int pixel;

	private String setPixel(int pixel) {
		this.pixel=pixel;
		return null;
	}

	void a(){
		DigitalCamera digitalCamera=new DigitalCamera();
		digitalCamera.setPixel(0);
	}

	int b() {
		pixel=1;
		return pixel;	
	}

}

public class B6_15_private{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DigitalCamera digitalCamera=new DigitalCamera();
		digitalCamera.a();
		System.out.println(digitalCamera.toString());

		System.out.println(digitalCamera.b());
	}

}
