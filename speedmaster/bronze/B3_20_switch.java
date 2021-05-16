package speedmaster.bronze;

public class B3_20_switch {

	public static void main(String[] args) {
		char[] array= {'a','b','c'};
		int count=0;

		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 'a':
				count++;
			case 'b':
				count++;
				break;
			case 'c':
				count++;
			case 'd':
				count++;
				break;
			}
		}
		System.out.println("Count = "+count);
	}

}
/*
Count = 5

*/