package speedmaster.gold;

import java.util.*;

class G2_2_Annotation{
	//コンパイル時の警告を抑制する。
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterizedJava(16777788)
		ArrayList list= new ArrayList();
		list.add(100);
		list.add("Duke");

		for (Object object : list) {
			System.out.println(object);
		}
	}
}