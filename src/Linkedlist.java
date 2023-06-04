import java.util.NoSuchElementException;

public class Linkedlist {

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

	}

	private Node first;
	private Node last;

	// Method to add number at the last
	public void addLast(int item) {
		Node node = new Node(item);
		if (isEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	// Method to add number at the first
	public void addFirst(int item) {
		Node node = new Node(item);
		if (isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}

	// Method to get the index of a number
	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		while (current != null) {
			if (current.value == item)
				return index;
			current = current.next;
			index++;
		}
		return -1;
	}

	// Method to check weather the given number is present or not
	public boolean contains(int item) {
//		Node current = first;
//		while (current != null) {
//			if (current.value == item)
//				return true;
//				current = current.next;
//		}
//		return false;
		return indexOf(item) != -1;

	}

	// Method to remove first number
	public void removeFirst() {
		if (isEmpty())
			throw new NoSuchElementException();
		if (first == last) {
			first = last = null;
			return;
		}
		Node second = first.next;
		first = null;
		first = second;
	}

	// Method to remove last number
	public void removeLast() {
		if (isEmpty())
			throw new NoSuchElementException();

		if (first == last) {
			first = last = null;
			return;
		}
		Node previous = getPrevious(last);
		last = previous;
		last.next = null;

	}

	// Method used to get previous node details for removeLast()
	private Node getPrevious(Node node) {
		Node current = first;
		while (current != null) {
			if (current.next == node)
				return current;
			current = current.next;
		}
		return null;
	}

	// Method to check whether first is null or not 
	private boolean isEmpty() {
		return first == null;
	}

	// Method used for printing linkedlist
	public void print() {
		Node current = first;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
}
