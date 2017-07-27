import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MainClass implements Serializable {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// Specify the name of our file:
		File file = new File("animals.dat");
		
		// Declare an array to hold the animals we read:
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		// Create a file and an object input stream:
		FileInputStream fileInput = new FileInputStream(file);
		
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		try {
			// Read all the animals specified in the file,
			// storing them in an array list:
			for(;;) {
				animals.add((Animal) objectInput.readObject());
			}
		}
		catch (EOFException e) {
			// We do not have to do anything here, this is the normal
			// termination of the loop above when all objects have
			// been read.
		}

		// Close the streams:
		objectInput.close();
		fileInput.close();
		for(Animal a: animals) {
			a.print();
		}
	}
}
