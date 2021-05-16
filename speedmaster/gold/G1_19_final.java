package speedmaster.gold;

final class Foo1{
	public void func() {

	}
}
class Bar{
	public final void test(int a,int b) {

	}
	public void func() {

	}
}
class Qux extends Bar{
	//スーパークラスでfinal修飾子が指定されているメソッドをサブクラスでオーバーライドすることはできない。
	/*
	public final void test(int num1,int num2) {

	}
	*/
	public void func() {

	}
}
public class G1_19_final {

	//private final int num=100;
	private Bar b = new Bar();
	public void func() {
		b.test(10, 20);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
