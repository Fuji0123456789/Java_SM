package speedmaster.gold;

interface Flyer2{
	void fly();
}
abstract class Airplane implements Flyer2{
	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("fly ");
	}
	public abstract void land();
}

public class G1_31_interface_abstract extends Airplane{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		メソッド land() は型 Flyer2 で未定義です
		Flyer2 p = new G1_31_interface();
		*/

		Airplane p = new G1_31_interface_abstract();//fly land

		/*
		G1_31_interface p = new G1_31_interface();//fly land
		*/

		/*
		メソッド land() は型 Flyer2 で未定義です
		Flyer2 p = new G1_31_interface();
		*/

		/*
		型 Airplane のインスタンスを生成できません
		Airplane p = new Airplane();
		*/

		p.fly();
		p.land();

	}

	@Override
	public void land() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("land ");
	}
}
