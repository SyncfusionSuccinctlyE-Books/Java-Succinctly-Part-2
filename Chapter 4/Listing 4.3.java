int resultOfAddition = performOperation(x, y,
			// Anonymous inner class used as a parameter	
			new MathOperation() {
			public int operation(int a, int b) {
				return a + b;
			}
		});
