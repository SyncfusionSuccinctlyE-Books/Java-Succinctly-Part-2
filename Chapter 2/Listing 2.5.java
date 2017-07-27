import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		File file = new File("test.txt");
		
		try {
			// Create a scanner from our file:
			Scanner in = new Scanner(file);
			
			// Read the first two lines into a string:
			String s = in.nextLine() + in.nextLine();
			
			// Reading variables:
			int i = in.nextInt();
			float f = in.nextFloat();
			boolean b = in.nextBoolean();
			double d = in.nextDouble();

			// Close the scanner:
			in.close();
			
			// Print out the results:
			System.out.println(
					"String: " + s + "\n" +
					"int: " + i + "\n" +
					"float: " + f + "\n" +
					"boolean: " + b + "\n" +
					"double: " + d );
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
