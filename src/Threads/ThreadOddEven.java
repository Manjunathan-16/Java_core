package Threads;

public class ThreadOddEven {

	Object lock = new Object();
	private int count = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadOddEven thread = new ThreadOddEven();

		Thread t1 = new Thread(thread::oddNumbers);
		Thread t2 = new Thread(thread::evenNumbers);

		t1.start();
		t2.start();
	}

	public void oddNumbers() {
		synchronized (lock) {
			while (count < 10) {
				if (count % 2 == 0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
				System.out.println(count);
				count++;
				lock.notify();
			}
		}
	}

	public void evenNumbers() {
		synchronized (lock) {
			while (count <= 10) {
				if (count % 2 != 0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
				System.out.println(count);
				count++;
				lock.notify();
			}
		}
	}
}
