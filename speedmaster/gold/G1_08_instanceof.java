package speedmaster.gold;

interface Test{

}
class ParentG1_08 implements Test{

}
class ChildG1_08 extends ParentG1_08{

}
class Duke{

}

public class G1_08_instanceof {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Test t = new ChildG1_08();
		ChildG1_08 c = new ChildG1_08();
		//Duke d = new Duke();
		if (t instanceof Parent) {
			System.out.println("AAA");
		}
		if (c instanceof Test) {
			System.out.println("BBB");
		}
		/*
		if (d instanceof Child) {
			System.out.println("CCC");
		}
		*/
	}

}
