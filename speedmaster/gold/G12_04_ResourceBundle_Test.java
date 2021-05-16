package speedmaster.gold;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author 暁丈
 * G12_04_ResourceBundle_Test
 */
class G12_04_ResourceBundle_Test{
	public static void main(String[] args){
		Locale.setDefault(new Locale("en", "US"));
		Locale loc=Locale.getDefault();
		ResourceBundle rb=ResourceBundle.getBundle("MyResources", loc);
		System.out.println(rb.getString("OK"));
	}
}
/*
Exception in thread "main" java.util.MissingResourceException: Can't find bundle for base name MyResources, locale en_US
	at java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1573)
	at java.util.ResourceBundle.getBundleImpl(ResourceBundle.java:1396)
	at java.util.ResourceBundle.getBundle(ResourceBundle.java:854)
	at speedmaster.gold.G12_04_ResourceBundle_Test.main(G12_04_ResourceBundle_Test.java:14)

WindowOpen

*/