package speedmaster.gold;

enum Color{
	Red("Aka"),Blue("Ao"),Black("Kuro");
	private String c;
	private Color(String c) {
		this.c=c;
	}
	public String getC() {
		return c;
	}
}

public class G1_26_enum {

	public static void main(String[] args) {
		for (Color color : Color.values()) {
			System.out.print(color.toString()+" : ");
			//System.out.println(color.getC());
		}
	}

}
/*
Red : Blue : Black : 
*/