package speedmaster.bronze;
/**
 *
 */

interface Calc{}
interface Camera7_9{}
class Phone{}

/*public */class MobilePhone extends Phone implements Calc,Camera7_9{}

public class B7_09_extends_implements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MobilePhone mobilePhone=new MobilePhone();
		System.out.println(mobilePhone.toString());
	}

}
