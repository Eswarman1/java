package Pangram;
public class Pangram {
	
	    public static void main(String[] args) {
	        String s = "The quick brown fox jumps over the lazy dog";//contains a to z alphs
	        boolean[] mark = new boolean[26];
	        int index = 0;
	        boolean pangram = true;

	        for (int i = 0; i < s.length(); i++) {
	            char cur = s.charAt(i);
	            if (cur >= 'A' && cur <= 'Z') {
	                index = cur - 'A';
	            } else if (cur >= 'a' && cur <= 'z') {
	                index = cur - 'a';
	            }
	            mark[index] = true;
	        }

	        for (int i = 0; i < mark.length; i++) {
	            if (!mark[i]) {
	                pangram = false;
	                break;
	            }
	        }

	        if (pangram) {
	            System.out.println("YAY !! It is a pangram fam!");
	        } else {
	            System.out.println("Sorry, not a pangram.");
	        }
	    
	}

}
