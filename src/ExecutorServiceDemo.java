import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calls thread
		ExecutorService e = Executors.newSingleThreadExecutor();
		Callable<Integer> c = () -> {
			Thread.sleep(3000);
			return 1;
		};
		Future<Integer> future = e.submit(c);

		// to print the thread method
		try {
			System.out.println(future.get());
			System.out.println("after");
		} catch (InterruptedException | ExecutionException e1) {
			e1.printStackTrace();
		}
		
		// to give two second delay after thread 
		try {
			e.awaitTermination(2, TimeUnit.SECONDS);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		// This will display after 2 seconds
		System.out.println("Main");

		// Will shut down the thread
		e.shutdown();
	}
}
