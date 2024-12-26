package APPEARENCE;

import java.util.HashMap;
import java.util.Scanner;

public class AOO {

    public static void main(String[] args) {
        
        System.out.println("Enter the first letter of your name and \n"
                + "the day of the month you were born: ");
        
        Scanner scan = new Scanner(System.in);
        
        String letter = scan.next().toUpperCase();
        int day = scan.nextInt();
        
        HashMap<String, String> letters = new HashMap<String, String>();
        letters.put("A", "GLORIOUS");
        letters.put("B", "MYSTICAL");
        letters.put("C", "ENCHANTING");
        letters.put("D", "SPARKLING");
        letters.put("E", "DAZZLING");
        letters.put("F", "MAGNIFICENT");
        letters.put("G", "ETHEREAL");
        letters.put("H", "LUMINOUS");
        letters.put("I", "SHIMMERING");
        letters.put("J", "RADIANT");
        letters.put("K", "AURORAL");
        letters.put("L", "RESPLENDENT");
        letters.put("M", "MESMERIZING");
        letters.put("N", "CAPTIVATING");
        letters.put("O", "BRILLIANT");
        letters.put("P", "OTHERWORLDLY");
        letters.put("Q", "SPELLBINDING");
        letters.put("R", "GLIMMERING");
        letters.put("S", "MAGICAL");
        letters.put("T", "TRANSCENDENT");
        letters.put("U", "WONDROUS");
        letters.put("V", "BEWITCHING");
        letters.put("W", "ILLUMINATING");
        letters.put("X", "GLEAMING");
        letters.put("Y", "MAJESTIC");
        letters.put("Z", "ALLURING");
        
        HashMap<Integer, String> days = new HashMap<Integer, String>();
        days.put(1, "SPECTRAL");
        days.put(2, "MYSTERIOUS");
        days.put(3, "ANCIENT");
        days.put(4, "RESPLENDENT");
        days.put(5, "LUMINOUS");
        days.put(6, "ARCANE");
        days.put(7, "SECRETIVE");
        days.put(8, "MYTHICAL");
        days.put(9, "ENIGMATIC");
        days.put(10, "TRANQUIL");
        days.put(11, "ARCANE");
        days.put(12, "LUMINOUS");
        days.put(13, "ANCIENT");
        days.put(14, "MYSTERIOUS");
        days.put(15, "ETHEREAL");
        days.put(16, "CELESTIAL");
        days.put(17, "ELUSIVE");
        days.put(18, "SERENE");
        days.put(19, "STELLAR");
        days.put(20, "SUPERNATURAL");
        days.put(21, "AURORAL");
        days.put(22, "RADIANT");
        days.put(23, "ENCHANTED");
        days.put(24, "FANTASTICAL");
        days.put(25, "WONDROUS");
        days.put(26, "GLIMMERING");
        days.put(27, "OTHERWORLDLY");
        days.put(28, "ILLUSIVE");
        days.put(29, "TRANSCENDENT");
        days.put(30, "DIVINE");
        days.put(31, "MAGICAL");
        
        System.out.println("You have a " + letters.get(letter) + " "
                + days.get(day) + " MAGIC APPEARANCE");
    }

}
