package speedmaster.bronze;

public class B2_10_Variable_Scope {
	final int a=0;
	public static void main(String[] args) {
		int num=10;
		calc2(num,num);
		System.out.println(num);//		10
		System.out.println(calc2(num,num));//		20
	}

	public static int calc2(int num1,int num2) {
		int num=num1+num2;
		return num;
	}
}
