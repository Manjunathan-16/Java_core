package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenTheArr {

	public static void main(String[] args) {
		Object[] array = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 } };

//        List<Object> flattenedList = Arrays.stream(array)
//                .flatMap(element -> {
//                    if (element instanceof Object[]) {
//                        return Arrays.stream((Object[]) element);
//                    } else {
//                        return Arrays.stream(new Object[]{element});
//                    }
//                })
//                .collect(Collectors.toList());
//
//        flattenedList.forEach(System.out::println);

//        List<Object> flattenedList = Arrays.stream(array)
//                .flatMap(element -> {
//                    if (element instanceof Object[]) {
//                        return Arrays.stream((Object[]) element);
//                    } else {
//                        return Arrays.asList(element).stream();
//                    }
//                })
//                .collect(Collectors.toList());
//
//        flattenedList.forEach(System.out::println);

		Object[] arr = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 } };
		Object[] flattenedArray = flatten(arr);

		for (Object elements : flattenedArray) {
			System.out.print(elements + " ");
		}
	}

	public static Object[] flatten(Object[] array) {
		List<Object> result = new ArrayList<>();
		for (Object element : array) {
			if (element instanceof Object[]) {
				for (Object nestedElement : flatten((Object[]) element)) {
					result.add(nestedElement);
					System.out.println(result);
				}
			} else {
				result.add(element);
				System.out.println("else" + result);
			}
		}
		return result.toArray();
	}
}
