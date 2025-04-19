package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> companies = new ArrayList<>();

		// checking if empty
		System.out.println("Is empty : " + companies.isEmpty());
		companies.add("Apple");
		companies.add("Microsoft");
		companies.add("Tesla");
		companies.add("Google");

		System.out.println("Companies : " + companies);

		// checking size
		System.out.println("Size : " + companies.size());

		// getting in array list
		String topCompanies = companies.get(3);
		String richCompanies = companies.get(companies.size() - 2);

		System.out.println("Top company : " + topCompanies);
		System.out.println("Rich company : " + richCompanies);

		// setting in array list
		companies.set(3, "Alphabet");
		System.out.println("Changed to parent company : " + companies);

		//Removing element from array list through different ways
		String rm = companies.remove(1);
		System.out.println(companies + " removed via index " + rm);

		boolean rm1 = companies.remove(richCompanies);
		System.out.println(companies + " removed via object " + rm1);

		companies.removeIf(s -> s.contains("Al"));
		System.out.println("removed via condition : " + companies);

		companies.clear();
		System.out.println("removed all comapnies : " + companies);
	}

}
