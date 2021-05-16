package speedmaster.bronze;
/**
 *
 */

class Account7_13{
	void dispBalance() {
		System.out.println("Account Blance");
	}
}

class SavingAccount7_13 extends Account7_13{
	void dispBalance() {
		System.out.println("SavingAccount Blance");
	}
}

class FastSavingAccount7_13 extends SavingAccount7_13{
	void dispBalance() {
		System.out.println("FastSavingAccount Blance");
	}
}

public class B7_13_type_casting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//暗黙的な型変換
		Account7_13 acc=new FastSavingAccount7_13();

		//SavingAccount sva=acc;
		//明示的なキャスト
		SavingAccount7_13 sva=(SavingAccount7_13)acc;
		System.out.println(sva.getClass().getName());

		acc.dispBalance();
	}

}
