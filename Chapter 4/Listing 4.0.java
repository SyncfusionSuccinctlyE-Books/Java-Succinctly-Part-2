public class MainClass {
	// Parent class
	static class OutputLyrics {
		public void output() {
			System.out.println("No lyrics supplied...");
		}
	}
		
	public static void main(String[] args) {
		
		// Create a normal instance from the OutputLyrics class
		OutputLyrics regularInstance = new OutputLyrics();
		
		// Anonymous Inner Class
		OutputLyrics anonymousClass = new OutputLyrics() {
			public void output() {
				System.out.println(
					"Desmond has a barrel at the market place.");
			}
		};
		
		// Call the output methods:
		regularInstance.output();
		
		// And using the anonymous class:
		anonymousClass.output();
	}
}
