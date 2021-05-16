package speedmaster.gold;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

class G12_15_Instant {
	public static void main(String[] args) {
		LocalTime time=LocalTime.of(0, 00);
		LocalDate date=LocalDate.of(2021, 2, 1);
		LocalDateTime dt=LocalDateTime.of(date, time);
		OffsetDateTime odt=dt.atOffset(ZoneOffset.of("Asia/Tokyo"));
		Instant instant=odt.toInstant();
		System.out.println(instant);
	}
}
/*
Exception in thread "main" java.time.DateTimeException: Invalid ID for ZoneOffset, invalid format: Asia/Tokyo
	at java.time.ZoneOffset.of(ZoneOffset.java:241)
	at speedmaster.gold.G12_15_Instant.main(G12_15_Instant.java:15)

*/