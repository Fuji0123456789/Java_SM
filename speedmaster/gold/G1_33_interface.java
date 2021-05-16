package speedmaster.gold;

interface FooG1_33{
	public default void func() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("Foo");
	}
}
interface BarG1_33 extends FooG1_33{
	//This static method cannot hide the instance method from FooG1_33Java(67109271)
	/*
	public static void func() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("Bar");
	}
	*/
}
/*
class Baz implements FooG1_33,BarG1_33{}
class G1_33_interface{
	public static void main(String[] args) {
		Baz baz = new Baz();
		baz.func();
	}
}
*/