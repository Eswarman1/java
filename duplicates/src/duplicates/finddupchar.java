package duplicates;

public class finddupchar {
public static void main(String[] args) {
	String sentence = "How many duplicates are there?";
	System.out.println(sentence);

	String characters = "";
	String duplicates = "";
	for (int i = 0; i < sentence.length(); i++) {
	  String current = Character.toString(sentence.charAt(i));
	  if (characters.contains(current)) {
	    if (!duplicates.contains(current)) {
	      duplicates += current + ",";
	    }
	  } else {
	    characters += current;
	  }
	}

	System.out.println(duplicates);
}

}
