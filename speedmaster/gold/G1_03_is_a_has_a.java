package speedmaster.gold;

import java.util.ArrayList;
import java.util.List;

interface I{

}
class A implements I{
	List<C> t=new ArrayList<C>();
}
class B extends A{

}
class C{
	void method() {

	}
}

public class G1_03_is_a_has_a {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.t);
		System.out.println(b.t.hashCode());
		System.out.println(b.t.isEmpty());
		System.out.println(b.t.size());
		System.out.println(b.t.toString());
		System.out.println(b.t.parallelStream());
		System.out.println(b.t.spliterator());
		System.out.println(b.t.toArray());
		b.t.clear();
		//b.t.notify();
		//b.t.notifyAll();
	}

}
