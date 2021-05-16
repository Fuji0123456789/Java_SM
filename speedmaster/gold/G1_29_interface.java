package speedmaster.gold;

interface Mobile {
	//コンパイラにより、public abstract修飾子が自動的に付与される。
	void running();
}
class Bike implements Mobile{
	@Override
	/*
	この行に複数マーカーがあります
	- speedmaster.gold.Mobile.running を実装します
	- Mobile から継承されたメソッドの可視性を下げることはできません
	*/
	public void running() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Bike Run!! ");
	}
}

public class G1_29_interface {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Bike b = new Bike();
		b.running();
	}

}
