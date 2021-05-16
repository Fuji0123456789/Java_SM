package speedmaster.gold;

public class G3_06_catch {
	public static void main(String[] args) throws Exception {
		try {
			func();
		} catch (ArithmeticException|NullPointerException/*|Exception*/ e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	static void func() throws ArithmeticException,NullPointerException,Exception {
		if (Math.random()>0.5) {
			throw new Exception("Exception");
		}
	}
}
/*
Exception

*/