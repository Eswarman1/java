package simple;
import java.util.Random;
public class dice {
	public static void main(String[] args) {
		Random no = new Random();
		int n=no.nextInt(5);
		System.out.println("The rolled value on dice is " +(n+1));
	}

}
