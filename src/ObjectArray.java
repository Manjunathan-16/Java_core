public class ObjectArray {

	public static void main(String[] args) {
		Object[] myArray = new Object[5];
		myArray[0] = "hello";
		myArray[1] = 2;
		myArray[2] = 3.14;
		myArray[3] = true;
		myArray[4] = new ClassForObject();

		// Printing the object values directly
		System.out.println("Displaying the object values :-");
		System.out.println("String - " + myArray[0]);
		System.out.println("Integer - " + myArray[1]);
		System.out.println("Double - " + myArray[2]);
		System.out.println("Boolean - " + myArray[3]);
		System.out.println("Object - " + myArray[4]);

		// Printing the object values by assigning to respective data type
		String str = (String) myArray[0];
		int ints = (Integer) myArray[1];
		double decimal = (double) myArray[2];
		Boolean flag = (boolean) myArray[3];

		System.out.println("\nDisplaying the object values by assigning to there respective data types :-");
		System.out.println("str " + str);
		System.out.println("ints " + ints);
		System.out.println("decimal " + decimal);
		System.out.println("flag " + flag);
		if (myArray[4] instanceof ClassForObject) {
			ClassForObject obj = (ObjectArray.ClassForObject) myArray[4];
			obj.ObjectMethod();
		} else {
			System.out.println("Object at index of 4 is not of type ClassForObject");
		}

	}

	public static class ClassForObject {
		public void ObjectMethod() {
			System.out.println("The object method created is called");
		}

		@Override
		public String toString() {
			return "Class for object";
		}

	}

}
