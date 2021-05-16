package speedmaster.gold;

import java.util.ListResourceBundle;

public class G12_05_ResourceBundle extends ListResourceBundle{
	private static final String contents[][]={
		{"OK","承認"},{"NG","取消し"}
	};
	@Override
	protected Object[][] getContents() {
		return contents;
	}
}
