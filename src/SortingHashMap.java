import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class SortingHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Manja");
		hm.put(4, "Devara");
		hm.put(2, "urali");
		hm.put(5, "abhi");
		hm.put(3, "mega");

		List<Map.Entry<Integer, String>> entryList = new ArrayList<>(hm.entrySet());

		// Sort the list based on the values in ascending order
		entryList.sort(Comparator.comparing(Map.Entry::getValue));

		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();

		// Put the sorted entries into the new LinkedHashMap
		for (Map.Entry<Integer, String> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		// Print the sorted map
		for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
