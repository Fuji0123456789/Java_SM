package speedmaster.gold;

import java.util.*;

class G2_3_Annotation{
	//Type safety: Potential heap pollution via varargs parameter mListJava(67109670)
	//@SuppressWarnings("varags")
	//@SafeVarargs
	@SuppressWarnings("unchecked")
	//@Unchecked
	public final void func(List<Integer>... mList){
		for (List<Integer> list : mList) {
			list.forEach(System.out::print);
			System.out.println();
		}
	}
}
class G2_3_Test{
	public static void main(String[] args) {
		//List<Integer> list1 = new List<Integer>();
		//list1.add(1);
		//G2_3_Annotation foo = new G2_3_Annotation();
		//foo.func(list1);
	}
}