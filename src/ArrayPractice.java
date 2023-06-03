
public class ArrayPractice {
	public static void main(String[] args) {
		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
//		System.out.println(numbers.indexOf(20));
//		numbers.removeAt(1);
		numbers.print();
	}

	public static class Array {
		private int[] items;
		private int count;
		private int[] newItems;

		// Method for creating an array
		public Array(int length) {
			items = new int[length];
		}

		// Method for inserting an element to array
		public void insert(int item) {
			if (items.length == count) {
				newItems = new int[count * 2];
				for (int i = 0; i < count; i++) {
					newItems[i] = items[i];
				}
				items = newItems;
			}
			items[count] = item;
			count++;
		}

		// Method to remove an element from an array
		public void removeAt(int index) {
			if (index < 0 || index >= count) {
				throw new IllegalArgumentException();
			}
			for (int i = index; i < count; i++) {
				items[i] = items[i + 1];
			}
			count--;
		}

		// Method to get indexof given number from the array
		public int indexOf(int item) {
			for (int i = 0; i < count; i++)
				if (items[i] == item)
					return i;

			return -1;
		}

		// Method used for printing an array
		public void print() {
			for (int i = 0; i < count; i++) {
				System.out.println(items[i]);
			}
		}
	}
}
