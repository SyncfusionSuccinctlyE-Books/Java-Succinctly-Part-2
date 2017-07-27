import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainClass {
	public static void main(String[] args) {
		
		// Create a file:
		File myFile = new File("Example.txt");
		
		// Surround all file manipulation with try/catch
		try {
			// Create a writer using the file
			PrintWriter writer = new PrintWriter(myFile);
			
			// Write a line of text to the file
			writer.println("This is some example text!");
			
			// Close the writer
			writer.close();
		
		}
		catch (FileNotFoundException e) {
			// File could not be opened, show an error message:
			System.out.println("The file could not be opened.");		
		}
	}
}
