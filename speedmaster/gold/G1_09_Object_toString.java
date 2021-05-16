package speedmaster.gold;

class Myclass /*extends Object*/{

}

public class G1_09_Object_toString {

	public static void main(String[] args) {
		System.out.println(new Myclass());
		Myclass a = new Myclass();
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		String s = new String();
		System.out.println(s.toString());
		System.out.println(s.hashCode());
	}

}
/*
speedmaster.gold.Myclass@7852e922
speedmaster.gold.Myclass@4e25154f
1311053135

0
*/