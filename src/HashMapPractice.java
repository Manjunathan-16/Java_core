import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Name", "Manjunath");
		map.put("Age", "25");
		map.put("Place", "Bangalore");
		map.put("Sex", "Male");
		// printing hashmap using for each loop
		for (Map.Entry m : map.entrySet()) {
			System.out.println("Printing from for each loop : " + m.getKey() + " " + m.getValue());
		}
		System.out.println("\n");
		// printing hashmap using set and iterator
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry mi = (Map.Entry) itr.next();
			System.out.println("Displaying through iterator : " + mi.getKey() + " " + mi.getValue());
		}
	}

}
