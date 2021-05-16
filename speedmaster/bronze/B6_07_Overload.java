package speedmaster.bronze;
/**
 *
 */

class Account{
	long balance(int var) {
		return 20000;
	}
	double rate(int var,char var2) {
		return 0.01;
	}
}

class SavingAccount extends Account{

	//オーバロード
	int balance(long var) {
		return 50000;
	}

	//オーバロード
	long balance(char var) {
		return 50000;
	}

	//オーバライド
	long balance(int var) {
		return 50000;
	}

	/*
	public float rate(int var,char var2) {
		return 0.05;
	}
	*/

	//オーバロード
	public double rate(char var,int var2) {
		return 0.05;
	}
}

public class B6_07_Overload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SavingAccount a=new SavingAccount();
		System.out.println(a.balance('あ'));
		System.out.println(a.balance(1));
		System.out.println(a.rate('あ', 1));
	}

}
