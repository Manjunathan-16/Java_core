
public class MainLinkedList {

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);

		list.addFirst(5);
		list.addFirst(1);
		list.addFirst(2);

//		list.removeFirst();
//		list.removeLast();
//		System.out.println("---------------------------------------");
//		System.out.println(list.indexOf(300));
//		System.out.println(list.contains(5));
		list.print();

	}

}
