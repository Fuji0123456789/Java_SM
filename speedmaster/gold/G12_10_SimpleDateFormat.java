package speedmaster.gold;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class G12_10_SimpleDateFormat{
	public static void main(String[] args) {
		SimpleDateFormat sdf;
		sdf=new SimpleDateFormat("MMMM",Locale.US);
		System.out.print(sdf.format(new Date()));
	}
}
/*
May
*/