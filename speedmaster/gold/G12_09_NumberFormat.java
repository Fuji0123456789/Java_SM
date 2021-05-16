package speedmaster.gold;

import java.text.NumberFormat;

public class G12_09_NumberFormat{
	public static void main(String[] args) {
		NumberFormat nf=NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(3);
		System.out.print(nf.format(12345)+" ");
		nf.setMinimumFractionDigits(3);
		System.out.println(nf.format(1234.5));
	}
}
/*
345 234.500

*/