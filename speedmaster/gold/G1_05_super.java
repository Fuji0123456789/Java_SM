package speedmaster.gold;

class Super{
	int a=1;
	String method() {
		return "super1";
	}
	protected static String method2() {
		return "super2";
	}
}
public class G1_05_super extends Super {
	int a=2;
	String method() {
		super.method2();
		return "sub1";
	}
	protected static String method2() {
		return "sub2";
	}
	public void func() {
		Super s = new G1_05_super();
		//The static method method2() from the type Super should be accessed in a static wayJava(603979893)
		System.out.println(s.method()/*+s.method2()*/+s.a);
	}

	public static void main(String[] args) {
		new G1_05_super().func();
	}

}
//sub1super21