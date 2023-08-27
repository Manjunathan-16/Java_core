package DailyCoding;

import java.util.HashMap;

public class LongestSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabacbebebe";
		int k = 3;
		int ans = longestkSubstr(s, k);
		System.out.println(ans);
	}

	public static int longestkSubstr(String s, int k) {
		// code here
		int i = 0;
		int j = 0;
		HashMap<Character, Integer> map1 = new HashMap<>();
		int max = -1;
		while (j < s.length()) {
			map1.put(s.charAt(j), map1.getOrDefault(s.charAt(j), 0) + 1);
			while (map1.size() > k) {
				map1.put(s.charAt(i), map1.get(s.charAt(i)) - 1);
				if (map1.get(s.charAt(i)) == 0) {
					map1.remove(s.charAt(i));
				}
				i++;
			}
			if (map1.size() == k) {
				max = Math.max(max, j - i + 1);
			}
			j++;
		}
		return max;
	}

}
