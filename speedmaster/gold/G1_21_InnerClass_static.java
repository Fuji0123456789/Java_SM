package speedmaster.gold;

//外側のクラス
public class G1_21_InnerClass_static {
	String msg;
	//内部クラス
	static class Inner{
		int counter=0;
		void increment() {
			counter++;
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new G1_21_InnerClass_static.Inner().increment();
	}

}
