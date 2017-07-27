public class Point implements Comparable {
	// Member variables:
	public double x, y;

	// Constructor
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Print out some info about the point:
	public void print() {
		System.out.println("X: " + x + " Y: " + y + " Mag: " +
				Math.sqrt(x*x+y*y));
	}
	
	public int compareTo(Object o) {
		// Firstly, if the second object if not a point
		if(!(o instanceof Point))
		 return 0;

		// Cast the other point:
		Point otherPoint = (Point) o;

		// Compute the absolute magnitude of each point from the origin:
		Double thisAbsMag = Math.sqrt(x * x + y * y);
		Double otherPointAbsMag =Math.sqrt(otherPoint.x * otherPoint.x +
				otherPoint.y * otherPoint.y); 

		return thisAbsMag.compareTo(otherPointAbsMag);

		
		/*
		// Note: Double.compareTo does something like the following:
		
 			// If this object has a greater magnitude:
			if(thisAbsMag > otherPointAbsMag) return 1;

			// If this object a smaller magnitude:
			if(thisAbsMag < otherPointAbsMag) return -1;

 			// If the object's magnitudes are equal:
			return 0;
		*/
	}
}
