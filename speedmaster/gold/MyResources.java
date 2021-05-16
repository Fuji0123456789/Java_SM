package speedmaster.gold;

import java.util.ListResourceBundle;

public class MyResources extends ListResourceBundle{
	private static final String contents[][]={
		{"OK","FileOpen"},
		{"NG","FileClose"}
	};
	@Override
	protected Object[][] getContents() {
		// TODO 自動生成されたメソッド・スタブ
		return contents;
	}
}