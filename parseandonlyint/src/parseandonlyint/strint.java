package parseandonlyint;

public class strint {


    public static void main(String[] args) {
        String ageString = "age: 47";
        ageString = ageString.replaceAll("\\D+", "");
        int ageNumber = Integer.parseInt(ageString);
        System.out.println(ageNumber + 2);
    }
}

