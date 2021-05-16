package speedmaster.bronze;
/**
 *
 */

public class B6_02_Instantiation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B6_02_Instantiation b6_02_Instantiation_1=new B6_02_Instantiation();
		B6_02_Instantiation b6_02_Instantiation_2=b6_02_Instantiation_1;
		B6_02_Instantiation b6_02_Instantiation_3=b6_02_Instantiation_2;
		B6_02_Instantiation b6_02_Instantiation_4=null;
		System.out.println(b6_02_Instantiation_3.getClass().getName()+b6_02_Instantiation_4);
	}

}
