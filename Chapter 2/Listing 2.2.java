import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {
	public static void main(String[] args) {
		try {
		// Create a file writer with the "append" parameter as "true":
			FileWriter file = new FileWriter("Example.txt", true);
			
			// Create a writer object from the file:
			PrintWriter writer = new PrintWriter(file);
			
			// Write some new text:
			writer.println("This text will be added to the end!");

			// Close the writer:
			writer.close();			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
