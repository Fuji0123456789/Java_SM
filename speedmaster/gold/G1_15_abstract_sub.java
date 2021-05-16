package speedmaster.gold;

public class G1_15_abstract_sub extends G1_14_abstract {
	String s;

	@Override
	public void foo() {
		s="aaaaa";
	}

	public static void main(String[] args) {
		G1_15_abstract_sub g = new G1_15_abstract_sub();
		g.foo();
		System.out.println(g.s);
	}

}
