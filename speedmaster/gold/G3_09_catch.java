package speedmaster.gold;

public class G3_09_catch {
	public static void main(String[] args) {
		try(
				TestRes t1=new TestRes("A");
				TestRes t2=new TestRes("B")) {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("catch ");
		}
	}
}
class TestRes implements AutoCloseable{
	private String name;
	public TestRes(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name=name;
	}
	public void close() throws Exception {
		System.out.print(name+":close ");
	}
}
/*
B:close A:close catch
*/