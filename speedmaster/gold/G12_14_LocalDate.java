package speedmaster.gold;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class G12_14_LocalDate{
	public static void main(String[] args) {
		ZonedDateTime depature=ZonedDateTime.of(2021, 1,1,3,0,0,0,ZoneId.of("UTC-7"));
		ZonedDateTime arrival=ZonedDateTime.of(2021, 1,1,9,0,0,0,ZoneId.of("UTC-9"));
		long hrs=ChronoUnit.HOURS.between(depature, arrival);
		System.out.println("THIS flight is for "+hrs+"hours");
	}
}
/*
THIS flight is for 8hours

*/