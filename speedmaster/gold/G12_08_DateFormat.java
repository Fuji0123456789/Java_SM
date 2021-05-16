package speedmaster.gold;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class G12_08_DateFormat{
	public static void main(String[] args) {
		DateFormat df;
		df=DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.US);
		System.out.print(df.format(new Date()));
	}
}
/*
May 4, 2021
*/