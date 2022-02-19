import java.util.Date;

public class Soal2 extends AbstractSoal {

	// the formatter (sdf) in abstract class, here is implementation abstract method for answer
	public void answer() throws Exception {
		String startDateString = "2022-09-19 08:52:45"; // given first date
		String endDateString = "2022-09-19 12:15:10"; // given end date
		
		Date startDate = sdf.parse(startDateString); // parse the given start date in string to Date java data type
		Date endDate = sdf.parse(endDateString); // parse the given end date in string to Date java data type
		
		long diff = endDate.getTime() - startDate.getTime(); // calculate difference time in milliseconds each date
		long diffSeconds = diff / 1000 % 60; // convert diff to seconds
		long diffMinutes = diff / (60 * 1000) % 60; // convert diff to minutes 
		long diffHours = diff / (60 * 60 * 1000) % 24; //convert diff to hours;
		
		//print it
		System.out.println("Jawaban "+this.getClass().getSimpleName());
		System.out.println("Waktu berangkat: "+sdf.format(startDate));
		System.out.println("Waktu tiba: "+sdf.format(endDate));
		System.out.println("Lama waktu perjalanan: "+diffHours+" jam, "+diffMinutes+" menit, "+diffSeconds+" detik");
	}
}
