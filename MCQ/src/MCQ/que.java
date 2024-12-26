package MCQ;
import java.util.Scanner;
public class que {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] answers = {"c", "a", "b"};
        String[] responses = new String[3];  

        System.out.println("What is 2 + 2?");
        System.out.println("a) 1");
        System.out.println("b) 3");
        System.out.println("c) 4");
        System.out.print("Your answer: ");
        responses[0] = scan.nextLine();

        System.out.println("What is the capital of North Carolina?");
        System.out.println("a) Raleigh");
        System.out.println("b) Durham");
        System.out.println("c) Charlotte");
        System.out.print("Your answer: ");
        responses[1] = scan.nextLine();
        
        System.out.println("What is the fastest land animal?");
        System.out.println("a) Tiger");
        System.out.println("b) Cheetah");
        System.out.println("c) Giraffe");
        System.out.println("d) Wolf");
        System.out.print("Your answer: ");
       

        responses [2] = scan.next();

        int score = 0;
        for (int i = 0; i < 3; i++) {
            if (responses[i].equalsIgnoreCase(answers[i])) {
                score++; 
            }
        }

        System.out.println("Score: " + score + "/3");
    }
}

        
        