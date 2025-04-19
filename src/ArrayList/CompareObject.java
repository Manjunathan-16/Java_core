package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareObject {

	public static void main(String[] args) {
		
		List<Person> per = new ArrayList<>();
		per.add(new Person("Manju", 25));
		per.add(new Person("Chitra", 54));
		per.add(new Person("Subramanyam", 56));
		per.add(new Person("Sharmila", 30));
		System.out.println("Person name with age : " + per);

		// Sorting by age using lambda function
		per.sort((person1, person2) -> {
			return person2.getAge() - person1.getAge();
		});
		System.out.println("Desceding order sorting "+per);
		
		// Sorting by using name with comparator
		Collections.sort(per, Comparator.comparing(Person::getName));
		System.out.println("Sorted with age : " + per);
		
		// Sorting by using age with comparator
		Collections.sort(per, Comparator.comparing(Person::getAge));
		System.out.println("Sorted with name : " + per);

	}

}
