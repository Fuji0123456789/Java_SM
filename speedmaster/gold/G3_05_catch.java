package speedmaster.gold;

public class G3_05_catch {
	static void func(String[] str) {
		try {
			for (int i = 1; i <= 3; i++) {
				System.out.print(str[i]+" ");
			}
		} catch (NullPointerException|ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getClass());
		}
	}
	public static void main(String[] args) throws Exception {
		String[] str= {"Java",null,"Duke"};
		func(str);
	}
}
/*
null Duke class java.lang.ArrayIndexOutOfBoundsException

*/