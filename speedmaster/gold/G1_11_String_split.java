package speedmaster.gold;

public class G1_11_String_split {

	public static void main(String[] args) {
		String str1="  Java,,Duke,,,Tiger  ";
		String str2=str1.trim();
		String[] str3=str2.split(",");
		System.out.println(str3[2]);
	}

}
/*
Duke

*/