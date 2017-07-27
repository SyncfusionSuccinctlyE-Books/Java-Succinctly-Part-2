public class MainClass {

	// Parent class
	static class MathOperation {
		public int operation(int a, int b) {
			return 0;
		}
	}

	// Method which takes an object of MathOperation as a parameter
	static int performOperation(int a, int b, MathOperation op) {
		return op.operation(a, b);
	}

	public static void main(String[] args) {
		// Some variables
		int x = 100;
		int y = 97;

		// Call the PerformOperation function with addition:
		int resultOfAddition = performOperation(x, y,
				// Anonymous inner class used as a parameter	
				new MathOperation() {
			public int operation(int a, int b) {
				return a + b;
			}
		});
		
		// Call the PerformOperation function with subtraction:
		int resultOfSubtraction = performOperation(x, y,
				// Anonymous inner class used as a parameter 
				new MathOperation() {
			public int operation(int a, int b) {
				return a - b;
			}
		});

		// Output Addition: 197
		System.out.println("Addition: " + resultOfAddition);

		// Output Subtraction: 3
		System.out.println("Subtraction: " + resultOfSubtraction);
	}
}
