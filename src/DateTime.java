import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Date API
		LocalDate date = LocalDate.of(2020, 5, 03);
		System.out.println(date);

		// Time API
		LocalTime time = LocalTime.now();
		System.out.println(time);

		// Date and Time API using zone ID
		LocalDateTime dt = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(dt);

		// Getting zone ID from the API
		ZoneId.getAvailableZoneIds();
		for (String i : ZoneId.getAvailableZoneIds()) {
			System.out.println(i);
		}
	}

}
