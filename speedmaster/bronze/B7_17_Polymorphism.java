package speedmaster.bronze;
/**
 *
 */

class Animal{
	public String toString() {
		return "Animal";
	}
}

class Cat7_17 extends Animal{
	public String toString() {
		return "Cat7_17";
	}
}

public class B7_17_Polymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal anm=new Animal();
		System.out.print(anm.toString());
		Cat7_17 cat=new Cat7_17();
		System.out.print(cat.toString());
		Object obj=anm;
		System.out.print(obj.toString());
		obj=cat;
		System.out.print(obj.toString());
	}

}
