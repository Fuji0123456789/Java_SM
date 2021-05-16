package speedmaster.bronze;
/**
 *
 */

public class B6_14_constructor_this {
	int num1,num2;
	public B6_14_constructor_this(int num2) {
		this.num2=num2*5;
		System.out.println("num2 : "+num2);
	}
	public B6_14_constructor_this(int num1,int num2) {
		this(num2);
		this.num1=num1+2;
		System.out.println("num1 : "+this.num1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1,num2;
		num1=2;
		num2=4;
		B6_14_constructor_this obj=new B6_14_constructor_this(num1,num2);
		System.out.println(obj.num1+obj.num2);
	}

}
