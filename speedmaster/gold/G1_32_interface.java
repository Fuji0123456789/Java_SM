package speedmaster.gold;

interface FooG1_32{
	public static void func() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("Foo");
	}
}
interface BarG1_32{
	public default void func() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("Bar");
	}
}
class Baz implements FooG1_32,BarG1_32{}
class G1_32_interface{
	public static void main(String[] args) {
		Baz baz = new Baz();
		baz.func();
	}
}
