package speedmaster.gold;

enum Rank{
	/*
	この行に複数マーカーがあります
	- コンストラクター Rank(int, int, int) は未定義です
	- コンストラクター Rank(int, int) は未定義です
	- コンストラクター Rank(int) は未定義です
	*/
	Gold(5),Silver(4,3),Bronze(2,1,0);
	int point;
	private Rank(int p) {
		// TODO 自動生成されたコンストラクター・スタブ
		point=p;
	}
	private Rank(int p1,int p2) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.point=p1+p2;
	}
	private Rank(int p3,int p4,int p5) {
		// TODO 自動生成されたコンストラクター・スタブ
		point=p3+p4+p5;
	}
	
}

public class G1_27_enum {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Rank r=Rank.Gold;
		System.out.println(r.point);
	}

}
/*
Exception in thread "main" java.lang.NullPointerException
	at speedmaster.gold.G1_27_enum.main(G1_27_enum.java:31)
*/