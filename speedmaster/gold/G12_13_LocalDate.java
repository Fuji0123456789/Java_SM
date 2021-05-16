package speedmaster.gold;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class G12_13_LocalDate{
	public static void main(String[] args) {
		LocalDate xmas=LocalDate.of(2021, 12, 25);
		DayOfWeek xmasday=xmas.getDayOfWeek();
		System.out.println("Christmas day is on "+xmasday);
	}
}
/*
Christmas day is on SATURDAY

*/