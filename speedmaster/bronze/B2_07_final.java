package speedmaster.bronze;

public class B2_07_final {
	final int a=0;
	public static void main(String[] args) {
		final double PI=0;
		String COMPANY_NAME=" ";
		//The final local variable PI cannot be assigned. It must be blank and not using a compound assignmentJava(536870970)
		//PI=3.14;
		COMPANY_NAME="JAVA";
		System.out.println(PI);
		System.out.println(COMPANY_NAME);

		//Java 円周率
		//https://blog.java-reference.com/java-math-pi/
		double PI1=0;
		PI1=Math.PI;
		System.out.println(PI1);
	}

}
