package speedmaster.gold;

public class G1_10_equals {

	public static void main(String[] args) {
		String str1="Duke";
		String str2 = new String("Duke");
		StringBuffer str3 = new StringBuffer("Duke");
		StringBuffer str4 = new StringBuffer("Duke");
		if (str1==str2) {
			System.out.println("A");
		}
		if (str1.equals(str2)) {
			System.out.println("B");
		}
		if (str2.equals(str3)) {
			System.out.println("C");
		}
		if (str3==str4) {
			System.out.println("D");
		}
		if (str3.equals(str4)) {
			System.out.println("E");
		}
	}

}
/*
B

*/