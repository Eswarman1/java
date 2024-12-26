package Currencyformmat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class CurrencyFormater {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner (System.in);
    double payment = scanner.nextDouble();
    scanner.close();
    
    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String India = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

    System.out.println("The CurrencyFormat acording to Countries are: ");
    System.out.println("US = " + us );
    System.out.println("INDIA = " + India);
    System.out.println("China = "+ china);
    System.out.println("France = "+france);
	}

}
