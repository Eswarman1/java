package File;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		// "C:\Users\eswar\OneDrive\Documents\captmidn.txt"

		File file = new File("C:/Users/eswar/OneDrive/Documents/captmidn.txt");
		Scanner scan = new Scanner(file);

		String fileContent = "THIS IS A NEW FILE MADE BY US";
		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}

		FileWriter writer = new FileWriter("/Users/alexlee/Desktop/newfile.txt");
		writer.write(fileContent);
		writer.close();

	}



	}

