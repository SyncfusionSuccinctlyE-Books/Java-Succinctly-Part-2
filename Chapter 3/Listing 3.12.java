import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {
		// The total number of points in the demo:
		int numberOfPoints = 5;
		
		// Create a list of random points:
		ArrayList<Point> points = new ArrayList<Point>();
		for(int i = 0; i < numberOfPoints; i++)
			points.add(new Point(Math.random() * 100,
Math.random() * 100));
		
		// Print the unsorted points:
		System.out.println("Unsorted: ");
		for(int i = 0; i < numberOfPoints; i++)
			points.get(i).print();

		
		// Sorting a collection of Comparable objects:
		Collections.sort(points);
		
		// Print the sorted points:
		System.out.println("Sorted: ");
		for(int i = 0; i < numberOfPoints; i++)
			points.get(i).print();
		
		
		// Sort the items in reverse order (from largest to smallest):
		points.sort(Collections.reverseOrder());

		// Print the points sorted in reverse:
		System.out.println("Sorted in Reverse: ");
		for(int i = 0; i < numberOfPoints; i++)
			points.get(i).print();
	}
}
