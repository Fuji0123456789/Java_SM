package speedmaster.bronze;

public class B2_08_block {
	final int a=0;
	public static void main(String[] args) {
		int x;
		x=1;
		{
			x=2;
			int y=1;
			y=2;
			
			System.out.println(y);
		}
		x=3;
		//y cannot be resolved to a variableJava(33554515)
		/*
		y=1;
		System.out.println(x+y);
		*/

		System.out.println(x);
	}
}