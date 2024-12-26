package File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class csvfile {


    public static void main(String[] args) {
        String filePath = "C:\Users\eswar\OneDrive\Documents\Desktop\SacramentocrimeJanuary2006.csv";
        String lineRead = "";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            while ((lineRead = bufferedReader.readLine()) != null) {
                String[] dataValues = lineRead.split(",");
                System.out.println("Date: " + dataValues[0] + ", Crime description: " + dataValues[5]);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
