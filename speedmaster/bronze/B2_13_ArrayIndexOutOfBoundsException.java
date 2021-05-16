package speedmaster.bronze;

public class B2_13_ArrayIndexOutOfBoundsException {
	final int a=0;
	public static void main(String[] args) {
		String[] str= {"AAA","BBB","CCC"};
		char ch[]= {'A','B'};
		int[] i3= {100,200,300,400};
		System.out.print(str[1]+":");
		System.out.print(ch[1]+":");
		//BBB:B:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
		System.out.print(ch[2]+":");
		System.out.print(i3[3]);
		System.out.println();
	}
}
