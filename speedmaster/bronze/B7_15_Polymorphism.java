package speedmaster.bronze;
/**
 *
 */

class Account7_15{
	void dispBalance() {};
}

class SavingAccount7_15 extends Account7_15{
	void dispBalance() {};
}

class BasicAccount7_15 extends Account7_15{
	void dispBalance() {};
}

public class B7_15_Polymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Account7_15 acc=new BasicAccount7_15();
		Account7_15 acc=new SavingAccount7_15();
		acc.dispBalance();
	}

}
