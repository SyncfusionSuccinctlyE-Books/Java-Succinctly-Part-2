import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainClass implements Serializable {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// Create some animals from our Serializable class:
		Animal stego = new Animal("Stegosaurus", 12.5f, true); 
		Animal croc = new Animal("Crocodile", 3.2f, false); 
		Animal mozzie = new Animal("Mosquito", 0.2f, false);

		// Output to the console:
		stego.print();
		croc.print();
		mozzie.print();
		
		// Specify the name of our file:
		File file = new File("animals.dat");
		
		// Create a FileOutputStream for writing to the file
		FileOutputStream fileOutput = new FileOutputStream(file);
		
		// Create object output stream to write serialized objects
		// to the file stream:
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
		
		// Write our objects to the stream:
		objectOutput.writeObject(stego);
		objectOutput.writeObject(croc);
		objectOutput.writeObject(mozzie);
		
		// Close the streams:
		objectOutput.close();
		fileOutput.close();
	}
}
