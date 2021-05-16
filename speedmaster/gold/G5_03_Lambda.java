package speedmaster.gold;

public class G5_03_Lambda {

	public static void main(String[] args) {
		G5_03_Portable<Integer> p=n->System.out.println("carry "+n+"kg");
		p.handCarry(20);
		p.delivery(100);
	}

}
/*
carry 20kg
ABC delivery
*/