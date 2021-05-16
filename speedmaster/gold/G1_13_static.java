package speedmaster.gold;

public class G1_13_static {

	public static void main(String[] args) {
		Foo f1 = new Foo(200);
		Foo f2 = new Foo(400);
		f1.func();
		f2.func();
	}
}

class Foo{
	private static int num1;
	private int num2;
	public Foo(int num3) {
		if (num3>num1) {
			//this.num1=num3;
			this.num2=num3;
		}
	}
	public void func() {
		System.out.println(num1+" "+num2);
	}
}
/*
400 200
400 400

*/