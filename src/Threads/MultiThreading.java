package Threads;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			MultiThreadThing myThing = new MultiThreadThing(i);
			MultiThreadThing myThing1 = new MultiThreadThing(i);

			// When Runnable is used
			Thread myThread = new Thread(myThing);
			Thread myThread1 = new Thread(myThing1);

			myThread.start();
			myThread1.start();

			// Join is used to run selected thread first
			try {
				myThread.join();
			} catch (InterruptedException e) {
				Thread.currentThread();
			}
		}
	}

}
