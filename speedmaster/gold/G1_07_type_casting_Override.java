package speedmaster.gold;

interface Exam{
	public abstract void test();
}
class Bronze{
	public static void pass() {
		System.out.print("B_Pass ");
	}
	public void test() {
		System.out.print("B_Test ");
	}
}
class Silver extends Bronze{
	public static void pass() {
		System.out.print("S_Pass ");
	}
}
class Gold extends Silver implements Exam{
	public static void pass() {
		System.out.print("G_Pass ");
	}
	public void test() {
		System.out.print("G_Test ");
	}
}

public class G1_07_type_casting_Override {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Exam e = new Gold();
		Bronze b1 = new Silver();
		Bronze b2 = (Bronze)e;
		b1.test();
		b2.test();
		//b1.pass();
		//b2.pass();
	}

}
/*
B_Test G_Test B_Pass B_Pass
*/