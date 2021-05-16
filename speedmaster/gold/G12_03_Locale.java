package speedmaster.gold;

import java.util.Locale;
class G12_03_Locale{
	public static void main(String [] args){
		Locale loc=Locale.getDefault();
		System.out.print(loc.getDisplayLanguage()+" : ");
		System.out.println(loc.getDisplayCountry());
		loc=new Locale("en");
		System.out.print(loc.getDisplayLanguage()+" : ");
		System.out.print(loc.getDisplayCountry());
	}
}
/*
日本語 : 日本
英語 :
*/