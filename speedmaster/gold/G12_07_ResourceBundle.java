package speedmaster.gold;

import java.util.Locale;
import java.util.ResourceBundle;

public class G12_07_ResourceBundle{
	public static void main(String[] args) {
		ResourceBundle.Control c=null;
		ResourceBundle rb=null;
		Locale loc=Locale.getDefault();
		c=ResourceBundle.Control.getControl(ResourceBundle.Control.FORMAT_CLASS);
		rb=ResourceBundle.getBundle("MyResources", loc,c);
		System.out.println(rb.getString("OK"));
	}
}
/*
Exception in thread "main" java.util.MissingResourceException: Can't find bundle for base name MyResources, locale ja_JP
	at java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1573)
	at java.util.ResourceBundle.getBundleImpl(ResourceBundle.java:1396)
	at java.util.ResourceBundle.getBundle(ResourceBundle.java:899)
	at speedmaster.gold.G12_07_ResourceBundle.main(G12_07_ResourceBundle.java:12)

*/