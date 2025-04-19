package DailyCoding;

import java.util.ArrayList;
import java.util.List;

public class AlmostEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "cgudllrbrjlgvxuheeuwpewiylhnthzprofdxysmsgwkcztglzedalvcgostfavcmxpcvyhzpqhffojqqytooathdjfxyezuhbpu";
		String s2 = "cgudllrbrjlgvxuheeuwpewiylhnthzprofdxysmsgwkcztglzedalvcgostfavcmxpcvyhzpqhffojqqytooathdjfxyezuhbpudniciuehstodlqxhhcydvccfpbbpczqdiczfwhsgdbvrgewfyajbahsicalrxhavovgxdwkinrcmwpmpxurkuxtrfdpencvkvxvs";

		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();

		for (int i = 0; i < s1.length(); i++) {
			list1.add(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			list2.add(s2.charAt(i));
		}
		int a = list1.size();
		int b = list2.size();
		System.out.println(a);
		System.out.println(b );
		if (a > b) {
//			return list1.size() - list2.size();
			System.out.println(a - b);
		} else if(b>a){
//			return list2.size() - list1.size();
			System.out.println(b - a);
		} else {
			System.out.println("0");
		}
	}

}
