package typingspeed;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Wpr {
	
	static String[] words = {"envelope","cantelope","the","typemaster","microphone",
			"elephant","biscuit","hammer","went","cap"};
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(3);
		TimeUnit.SECONDS.sleep(1);
		System.out.println(2);
		TimeUnit.SECONDS.sleep(1);
		System.out.println(1);
		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		
		for(int i=0;i<10;i++) {
		System.out.print(words[rand.nextInt(9)] + " ");
		}
		System.out.println();
	
		
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typewords = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay();
		double timetaken= end - start;
		double seconds = timetaken/ 1000000000.0;
		System.out.println(typewords);
		System.out.println(timetaken+"in nano second");
		System.out.println(seconds +"in seconds");
		
		int numchars = typewords.length();
		int wordspermin =  (int)((((double)numchars/5)/seconds)*60);
		
		System.out.println("Your wpm is i.e speed is "+wordspermin);
		
		
		
		
		
}
}

