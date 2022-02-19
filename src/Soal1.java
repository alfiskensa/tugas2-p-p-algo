import java.text.SimpleDateFormat;
import java.util.Date;

public class Soal1 extends AbstractSoal {

	// the formatter (sdf) in abstract class, here is implementation abstract method for answer
	public void answer() throws Exception {
		String startDateString = "2022-09-19 08:52:45"; // given first date
		int timeSecond = 5000; // how much seconds for increase
		Date date = sdf.parse(startDateString); // parse the given date in string to Date java data type
		
		long currentTime = date.getTime(); // convert date to long milliseconds
		
		final long resultTime = currentTime + (timeSecond * 1000); // add current milliseconds with given time in second and convert it to milliseconds
		
		Date finalDate = new Date(resultTime); // parse the result total milliseconds to Date java data type
		
		// print it
		System.out.println("Jawaban "+this.getClass().getSimpleName());
		System.out.println("Waktu awal diberikan: "+sdf.format(date));
		System.out.println("Waktu setelah ditambahkan "+timeSecond+" detik: "+sdf.format(finalDate));
		System.out.println("");
	}
}
