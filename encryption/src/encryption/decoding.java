package encryption;

public class decoding {
	
	    public static void main(String[] args) {
	        String greeting = "Hey, how's it hangin'?";
	        System.out.println(greeting);
	        int key = 5;

	        char[] characters = greeting.toCharArray();
	        for(int i = 0; i < characters.length; i++) {
	            characters[i] += key;
	        }
	        System.out.println(new String(characters));
	    }
	


}
