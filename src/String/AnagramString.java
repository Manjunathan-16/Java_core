package String;

import java.util.HashMap;
import java.util.Map;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "geeksforgeeks", b = "forgeeksgeeks";
		Map<Character, Integer> h1 = new HashMap<>();
		Map<Character, Integer> h2 = new HashMap<>();

		if (a.length() != b.length()) {
			System.out.println("Not an annagram");
			System.exit(0);
		}
		int i = 0;
		int size = a.length();
		while (i != size) {
			h1.put(a.charAt(i), h1.getOrDefault(a.charAt(i), 0) + 1);
			h2.put(b.charAt(i), h2.getOrDefault(b.charAt(i), 0) + 1);
			i++;
		}
		for (Map.Entry<Character, Integer> ansMap : h1.entrySet()) {
			char key = ansMap.getKey();
			int countA = ansMap.getValue();
			int countB = h2.getOrDefault(key, 0);
			if (countA != countB) {
				System.out.println("Not an annagram");
				System.exit(0);
			}
		}
		System.out.println("Anagram");
	}

}
