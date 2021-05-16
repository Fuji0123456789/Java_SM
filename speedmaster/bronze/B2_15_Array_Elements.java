package speedmaster.bronze;

public class B2_15_Array_Elements {
	final int a=0;
	public static void main(String[] args) {
		String s3[]= {"foo","bar","baz"};
		int i5[]=new int[3];
		char c3[]=new char[5];
		i5[1]=100;
		i5[2]=200;
		c3[0]='A';
		c3[1]='B';
		c3[2]='C';
		c3[3]='D';
		System.out.println("length:"+(s3.length+i5.length+c3.length));
	}
}
