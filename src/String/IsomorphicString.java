package String;

import java.util.HashMap;

public class IsomorphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "egg";
		String t = "add";

		String s3 = "foo";
		String s4 = "bar";
		System.out.println(isIsomorphic(s, t));
		System.out.println("=================");
		System.out.println(isIsomorphic(s3, s4));

		if (s.length() != t.length()) {
			System.out.println(false);
		}
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);

			if (map1.containsKey(ch1)) {
				if (map1.get(ch1) != ch2) {
					System.out.println(false);
					System.exit(1);
				}
			} else {
				map1.put(ch1, ch2);
			}

			if (map2.containsKey(ch2)) {
				if (map2.get(ch2) != ch1) {
					System.out.println(false);
					System.exit(1);
				}
			} else {
				map2.put(ch2, ch1);
			}
		}
	}

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		// HashMaps to store the character mappings
		HashMap<Character, Character> mapS = new HashMap<>();
		HashMap<Character, Character> mapT = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			// Use getOrDefault() to retrieve mapped values or default if no mapping exists
			if (mapS.getOrDefault(c1, c2) != c2 || mapT.getOrDefault(c2, c1) != c1) {
				return false;
			}

			// Store the mappings if they are not yet present
			mapS.put(c1, c2);
			mapT.put(c2, c1);
		}

		return true;
	}
}
