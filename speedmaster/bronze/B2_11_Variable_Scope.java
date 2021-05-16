package speedmaster.bronze;

public class B2_11_Variable_Scope {
	public static void main(String[] args) {
		//int ary1[5];

		//int ary2=new int[5];

		int[] ary3=new int[5];
		ary3[0]=123;
		for (int i : ary3) {
			System.out.println(i);
		}

		//int ary4[]=new int()[5];
		int ary4[]=new int[5];
		ary4[0]=123;
		for (int i : ary4) {
			System.out.println(i);
		}

		int ary5[]= {111,222,333};
		for (int i : ary5) {
			System.out.println(i);
		}

		//int[] ary6=new int(5);
	}
}
