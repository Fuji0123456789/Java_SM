package speedmaster.gold;

class G1_18_Test{
	final String str;
	public G1_18_Test(final String t) {
		str=t;
	}
	public G1_18_Test(String s,String t) {
		this(t);
		//The final field str may already have been assignedJava(33554514)
		//str=s;
		s="unknown";
	}
}

public class G1_18_final {
	public static void main(String[] args) {
		G1_18_Test g1 = new G1_18_Test("松井秀喜");
		G1_18_Test g2 = new G1_18_Test("イチロー","大谷翔平");
		System.out.println(g1.str);
		System.out.println(g2.str);
	}
}
/*

*/