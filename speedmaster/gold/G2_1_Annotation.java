package speedmaster.gold;

interface ExTest{
	int i=100;
	public abstract void func1();
	public default void func2(String str){}
}
//The annotation @Override is disallowed for this locationJava(16777838)
//@Override
class TestG2_1 implements ExTest{
	//The annotation @Override is disallowed for this locationJava(16777838)
	//@Override
	//private int i=1;
	@Override
	public void func1(){}
	@Override
	public void func2(String str){}

	//Syntax error on token "print", Identifier expected after this tokenJava(1610612967)
	//System.out.print();
}
