package encryption;

public class decode {


public static void main(String[] args) {
    String sentence = "The quick brown fox jumps over the lazy dog";
    boolean[] letterPresence = new boolean[26];
    int alphabetIndex = 0;

    for (int i = 0; i < sentence.length(); i++) {
        char currentCharacter = sentence.charAt(i);

        if (currentCharacter >= 'A' && currentCharacter <= 'Z') {
            alphabetIndex = currentCharacter - 'A';
        } else if (currentCharacter >= 'a' && currentCharacter <= 'z') {
            alphabetIndex = currentCharacter - 'a';
        }
        System.out.println(alphabetIndex);

        
        if(letterPresence[alphabetIndex]) {
        	System.out.println(true);
        }else {
        	System.out.println(false);
        }
        
    }
  }
}
