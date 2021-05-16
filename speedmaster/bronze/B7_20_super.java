package speedmaster.bronze;
/**
 *
 */

class Account7_20{
	int	balance;
	Account7_20(int balance){
		this.balance=balance;
	}
}

/**
 * @author 暁�?
 *
 */
public class B7_20_super extends Account7_20 {
	protected double rate;

	B7_20_super(int balance,double rate) {
		super(balance);
		this.rate=rate;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B7_20_super sa=new B7_20_super(50000,0.05);
		System.out.println(sa.balance);
		System.out.println(sa.rate);
	}

}
