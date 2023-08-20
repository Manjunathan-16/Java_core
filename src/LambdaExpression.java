
interface Animal {
	void print();
}

class Cat implements Animal {
	public String name;
	public int age;

	public Cat() {

	}

	public void print() {
		System.out.println("meow");
	}
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal msg = () -> System.out.println("meow");
		printThing(msg);
	}

	static void printThing(Animal a) {
		a.print();
	}
}
