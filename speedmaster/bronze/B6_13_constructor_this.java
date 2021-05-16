package speedmaster.bronze;
/**
 *
 */

public class B6_13_constructor_this {
	int value1,value2;

	public B6_13_constructor_this(int value2) {
		this.value2=value2;
	}
	public B6_13_constructor_this(int value1,int value2) {
		this.value1=++value1;
		//this(value2++);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value1=2;
		int value2=4;
		B6_13_constructor_this obj=new B6_13_constructor_this(value1,value2);
		System.out.println(obj.value1+" : "+obj.value2);
	}

}
