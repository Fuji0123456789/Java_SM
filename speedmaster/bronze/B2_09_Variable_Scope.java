package speedmaster.bronze;

public class B2_09_Variable_Scope {
	final int a=0;
	public static void main(String[] args) {
		int ans=calc1(2,4);
		//num1 cannot be resolved to a variableJava(33554515)
		//System.out.println("ans"+(num1+num2));
//		ans: 6
		System.out.println("ans: "+ans);
	}

	public static int calc1(int num1,int num2) {
		return num1+num2;
	}
}
