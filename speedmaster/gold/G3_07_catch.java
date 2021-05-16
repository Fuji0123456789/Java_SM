package speedmaster.gold;

class FooException extends Exception{
	public void func() {
		System.out.println("FooException");
	}
}

class BarException extends Exception{
	public void func() {
		System.out.println("BarException");
	}
}

public class G3_07_catch {
	public static void main(String[] args) {
		try {
			test(Integer.parseInt(args[0]));
		} catch (FooException|BarException e) {
			// TODO: handle exception
			//e.func();
		}
	}
	public static void test(int num) throws FooException,BarException {
		if (num<0) {
			throw new FooException();
		} else {
			throw new BarException();
		}
	}
}
/*
Exception

*/