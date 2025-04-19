package Threads;

public class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj = () -> System.out.println("Interface using lambda");
		obj.show();

		ExtendedInterface et = new ExtendedInterface();
		et.show();

		// implementing runnable using lambda function
		Runnable r = () -> {
			System.out.println("Runnable thread");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				Thread.currentThread();
			}
			System.out.println("Runnable thread after sleep");
		};
		
		r.run();
	}

}
