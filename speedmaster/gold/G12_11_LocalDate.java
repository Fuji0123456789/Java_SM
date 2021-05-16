package speedmaster.gold;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class G12_11_LocalDate{
	public static void main(String[] args) {
		//コンストラクター LocalDate(int, int, int) は不可視です
		//LocalDate xmas=new LocalDate(2021,12,25);
		//ファクトリメソッド
		//https://qiita.com/munieru_jp/items/86b0f193bf6f6847e91a
		LocalDate xmas=LocalDate.of(2021,12,25);
		DayOfWeek xmasday=xmas.getDayOfWeek();
		System.out.println("Christmas day is on "+xmasday);
	}
}
/*
Christmas day is on SATURDAY

*/