package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ArrayListThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<Integer> list = new ArrayList<>();
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		list.add(1);
		list.add(2);
		list.add(3);

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		Runnable r = () -> {
			increment(list);
		};

		for (int i = 0; i < 100; i++) {
			executorService.submit(r);
		}

		executorService.shutdown();

		try {
			executorService.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(list);
	}

	private static void increment(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int value = list.get(i);
			list.set(i, value + 1);
		}
	}
}
