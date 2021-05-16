package speedmaster.gold;

interface G1_36_interface{
	public default void func1() {
		// TODO 自動生成されたメソッド・スタブ
		func3();
		func4();

		func2();
	}
	//Java SE 9から、インタフェースにprivateメソッドの定義が可能となった。
	//The method func2() from the type G1_36_interface is never used locallyJava(603979894)
	private void func2(){
		func3();
		func4();
	}
	//Java SE 9から、インタフェースにprivateメソッドの定義が可能となった。
	private void func3(){}
	//Java SE 9から、インタフェースにprivateメソッドの定義が可能となった。
	private static void func4(){}
}
class G1_36_interface_Main implements G1_36_interface{
	public static void main(String[] args) {
		//System.out.println(System.getProperty("java.version")+"\n"+SourceVersion.latestSupported().name());
		G1_36_interface_Main g = new G1_36_interface_Main();
		g.func1();
	}
}
/*
Sample
*/