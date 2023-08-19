interface Phone {
	void call();
//Default method in interface
	default void ring() {
		System.out.println("ringing");
	}
}

class Android implements Phone {
	//declaring interfacing method inside the SUB class
	public void call() {
		System.out.println("calling");
	}
}

public class DefaultMethodInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Android();
		p.call();
		p.ring();
	}

}
