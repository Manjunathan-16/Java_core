package InterviewQuestions;

public class MutlitThreadPrintNumbers {

	private final Object lock = new Object();
	private int count = 1;

	public static void main(String[] args) {
		MutlitThreadPrintNumbers printNumbers = new MutlitThreadPrintNumbers();
		Thread t1 = new Thread(printNumbers::printOddNumbers);
		Thread t2 = new Thread(printNumbers::printEvenNumbers);

		t1.start();
		t2.start();
	}

	private void printOddNumbers() {
		synchronized (lock) {
			while (count < 100) {
				if (count % 2 == 0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
						return;
					}
				}
				System.out.println(count);
				count++;
				lock.notify();
			}
		}
	}

	private void printEvenNumbers() {
		synchronized (lock) {
			while (count <= 100) {
				if (count % 2 != 0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
						return;
					}
				}
				System.out.println(count);
				count++;
				lock.notify();
			}
		}
	}
}
