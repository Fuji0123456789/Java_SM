package speedmaster.bronze;
/**
 *
 */

class Engineer7_14{
	String name;
	Engineer7_14(String name){
		this.name=name;
	}
	public void print() {
		System.out.println(name);
	}
}

class Programmer extends Engineer7_14{
	private String lang;

	/*
	Programmer(String name) {
		super(name);
	}
	*/

	Programmer(String name,String lang){
		super(name);
		this.lang=lang;
	}

	public void print() {
		System.out.println(name+" : "+lang);
	}
}

public class B7_14_Polymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Engineer7_14 eng1,eng2;
		eng1=new Engineer7_14("Sato");
		eng2=new Programmer("Suzuki","Java");
		eng1.print();
		eng2.print();

	}

}
