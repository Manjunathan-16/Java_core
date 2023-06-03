
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

	public void addLast(int item) {
		Node node = new Node(item);
		if (isEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public void addFirst(int item) {
		Node node = new Node(item);
		if (isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}

	public int indexOF(int item) {
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

	public boolean contains(int item) {
		Node current = first;
		while (current != null) {
			if (current.value == item)
				return true;
				current = current.next;
		}
		return false;
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void print() {
		Node current = first;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
}
