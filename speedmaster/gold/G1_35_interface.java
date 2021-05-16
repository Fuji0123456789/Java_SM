package speedmaster.gold;

interface Sample{
	public default void func1() {
		// TODO 自動生成されたメソッド・スタブ
		func2();
	}
	//Java SE 9から、インタフェースにprivateメソッドの定義が可能となった。
	private void func2(){
		System.out.println("Sample");
	}
}
class G1_35_interface implements Sample{
	public void func2(){
		System.out.println("Test");
	}
	public static void main(String[] args) {
		Sample s = new G1_35_interface();
		s.func1();
	}
}
/*
Sample
*/