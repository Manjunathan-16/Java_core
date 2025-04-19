package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RevArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 2, 4, 3, 1 };
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
//			if(list.contains(arr[i])) {
			list.add(arr[i]);
//			}
		}
		System.out.println(list);
		Map<Integer, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		for (Map.Entry<Integer, Long> ans : map.entrySet()) {
			if (!(ans.getValue() > 1)) {
				System.out.print(ans.getKey());
			}
		}
	}

}
