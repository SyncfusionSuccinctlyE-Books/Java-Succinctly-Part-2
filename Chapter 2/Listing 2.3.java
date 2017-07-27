import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainClass {
	public static void main(String[] args) {
		File file = new File("test.txt"); 
		try {
			PrintWriter out = new PrintWriter(file);
			// Writing Text
out.println("Be good. If you can't be good, be lucky!\n\t~ Alan Davis");
			
			// Characters/floats/Boolean/doubles are all written in
			// human readable form:
			out.println( 129 ); // Integers
			out.println( 2.7183f ); // Floats
			out.println( true ); // Boolean
			out.println( 1.618034 ); // Double
			// Close writers after using them so they can be opened by
			// other programs:
			out.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}
}
