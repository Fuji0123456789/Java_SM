package speedmaster.gold;

//外側のクラス
public class G1_25_InnerClass {
	//内部クラス
	class Inner{
		void foo() {
			System.out.println("foo");
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new G1_25_InnerClass().new Inner().foo();
	}

}
