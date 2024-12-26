package AgeCalc;

import java.time.LocalDate;
import java.time.Period;
public class Ageal {





    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2006, 3, 15);
        int ageInYears = Period.between(birthDate, today).getYears();
        int ageIndays = Period.between(birthDate, today).getDays();
        int ageInmonths = Period.between(birthDate, today).getMonths();
        

        System.out.println("Birthdate: " + birthDate);
        System.out.println("Currentdate: " + today);
        System.out.println("Age in years: " + ageInYears);
        System.out.println("Age in days: " + ageIndays);
        System.out.println("Age in months: " + ageInmonths);
        
    }
}
