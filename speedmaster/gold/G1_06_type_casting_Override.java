package speedmaster.gold;

class Parent{
	public void func() {
		System.out.print("Parent ");
	}
}
class Child extends Parent{
	public void func() {
		System.out.print("Child ");
	}
}

public class G1_06_type_casting_Override {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Parent p = new Parent();
		Parent c = new Child();
		p.func();
		c.func();
	}

}
//Parent Child