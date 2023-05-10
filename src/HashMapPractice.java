import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "M");
		map.put(2, "a");
		map.put(3, "n");
		map.put(4, "j");
		for (Map.Entry m : map.entrySet())
			System.out.println(m.getKey() + " " + m.getValue());

	}

}
