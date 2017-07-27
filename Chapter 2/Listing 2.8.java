import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class MainClass implements Serializable {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		// Specify the name of our file:
		File file = new File("animals.dat");

		// Declare an array to hold the animals we read:
		Animal[] animals = new Animal[3];

		// Create a file and an object input stream:
		FileInputStream fileInput = new FileInputStream(file);
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		
		// Read the objects from the file:
		try {
			animals[0] = (Animal) objectInput.readObject();
			animals[1] = (Animal) objectInput.readObject();
			animals[2] = (Animal) objectInput.readObject();

			// Close the streams:
			objectInput.close();
			fileInput.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// Print the objects:
		System.out.println("Objects read from file: ");
		for(int i = 0; i < 3; i++) {
			animals[i].print();
		}
	}
}
