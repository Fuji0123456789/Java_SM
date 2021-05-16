package speedmaster.bronze;

public class B4_02_while {

	public static void main(String[] args) {
		int num=0;
		while(true) {
			System.out.print(num);
			num++;
			if (num==5) {
				break;
			}
		}
	}

}
/*
01234
*/