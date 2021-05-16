package speedmaster.gold;

interface Test1{
	public default void func() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Test1");
	}
}
interface Test2 extends Test1{
	public default void func() {
		// TODO 自動生成されたメソッド・スタブ
		
		//無限ループ？
		//this.func();

		//Cannot make a static reference to the non-static method func() from the type Test1
		//Test1.func();

		//super reference is illegal in interface context
		//super.func();

		Test1.super.func();
		/*
		Test1
		*/
	}
}
class G1_34_interface implements Test2{
	public static void main(String[] args) {
		G1_34_interface t = new G1_34_interface();
		t.func();
	}
}
/*
Test1
*/