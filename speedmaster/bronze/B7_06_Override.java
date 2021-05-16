package speedmaster.bronze;
/**
 *
 */

class Account7_6{
	int balance;
	public long getBalance(int value) {
		return balance-=value;
	}
}

public class B7_06_Override extends Account7_6{
	public long getBalance(int value) {
		return balance+=value;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B7_06_Override speedMaster7_6=new B7_06_Override();
		System.out.println(speedMaster7_6.getBalance(100));
	}

}
