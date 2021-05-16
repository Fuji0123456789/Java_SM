package speedmaster.gold;

final class Static{
	public static void static_method() {

	}
}
final class Final{
	final void final_method() {

	}
}
//クラス Abstract は abstract または final のどちらかです。両方は許可されません
//抽象メソッドを定義するには、型 Abstract は抽象クラスでなければなりません
/*
abstract final class Abstract{
	//型 Abstract の 抽象メソッド abstract_method は 抽象クラスによってのみ定義できます
	abstract void abstract_method();
}
*/
final class Private{
	//The method private_method() from the type Private is never used locallyJava(603979894)
	//private void private_method() {}
}
/*
final class Default{
	//Default methods are allowed only in interfaces.
	default void default_method() {

	}
}
*/
public class G1_20_final_class {
	private static String player(int number) {
		return "モドリッチ";
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(player(10));

		//Private p = new Private();
		//The method private_method() from the type Private is not visibleJava(67108965)
		//p.private_method();
	}
}
