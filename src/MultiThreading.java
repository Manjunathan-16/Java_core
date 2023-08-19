
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			MultiThreadThing myThing = new MultiThreadThing(i);
			MultiThreadThing myThing1 = new MultiThreadThing(i);
			// Start is used to run multiple threads at a time
			myThing.start();
			myThing1.start();

			// When Runnable is used
//			Thread myThread = new Thread(myThing);
//			Thread myThread1 = new Thread(myThing1);
//			myThread.start();
//			myThread1.start();

			// Join is used to run selected thread first
			try {
//				myThread.join();
				myThing.join();
			} catch (InterruptedException e) {

			}
		}
	}

}
