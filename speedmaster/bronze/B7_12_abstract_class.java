package speedmaster.bronze;
/**
 *
 */

public /*abstract*/ class B7_12_abstract_class {
	public B7_12_abstract_class(String name) {
		disp(name);
	}

	public void disp(String name) {
		System.out.println(name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B7_12_abstract_class b7_12_abstract_class=new B7_12_abstract_class("Java");
		System.out.println(b7_12_abstract_class.getClass().getName());
	}

}
