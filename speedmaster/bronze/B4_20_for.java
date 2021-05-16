package speedmaster.bronze;

public class B4_20_for {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.print('/');
		}
	}

}
