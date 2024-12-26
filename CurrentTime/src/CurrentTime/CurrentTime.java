package CurrentTime;
import java.util.Date;
import java.text.SimpleDateFormat;
public class CurrentTime {

	public static void main(String[] args) {
		//dates and time based link
      //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		
		        Date now = new Date();
		        System.out.println(now);

		        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");
		        System.out.println(timeFormatter.format(now));

		        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
		        System.out.println(dateFormatter.format(now));

		        SimpleDateFormat dayOfWeekFormatter = new SimpleDateFormat("EEEE");
		        System.out.println(dayOfWeekFormatter.format(now));

		        SimpleDateFormat dateformat = new SimpleDateFormat("h:mm a");
		        System.out.println(dateformat.format(now));
		    


	}

}
