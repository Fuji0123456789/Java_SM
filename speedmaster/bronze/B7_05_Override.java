package speedmaster.bronze;
/**
 *
 */

class Employee7_5{
	String disp() {
		return "emp";
	}
}

//http://www.javaroad.jp/bbs/answer.jsp?q_id=20071008010651552
/*public */class Engineer7_5 extends Employee7_5{
	//繧ｪ繝ｼ繝舌?ｼ繝ｩ繧､繝?
	public String disp() {
		return "work";
	}
}

public class B7_05_Override {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Engineer7_5 a=new Engineer7_5();
		System.out.println(a.disp());
	}

}
