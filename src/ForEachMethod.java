import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(2);
		values.add(4);
		values.add(6);
		values.add(8);
//for loop
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}
//for each loop
		for (int i : values) {
			System.out.println(i);
		}
//for each method
		values.forEach(i -> System.out.println(i));
	}

}
