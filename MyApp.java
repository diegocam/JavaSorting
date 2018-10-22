import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class MyApp {

	static List<Person> sort(Iterable<Person> people, String sortField, String ascending) {

		// Build persons list
		List<Person> persons = new ArrayList<>();
		people.forEach(persons::add);

		// Use Collections for comparison sorting
		Collections.sort(persons, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				
				// Sort logic for DOB
				if(sortField == "dob") {
					
					if (ascending == "asc") {
						// Logic for ascending
						return p1.dateOfBirth.compareTo(p2.dateOfBirth);
					} else {
						// Logic for descending
						return p2.dateOfBirth.compareTo(p1.dateOfBirth);
					}
				}
				
				return 0;
			
			}
		});

		return persons;
	}

	public static void main(String args[]) {

		// Populate people with list of Persons
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Diego", "Camacho", new Date("08/06/1984"), "123", 5.8, 170.0));
		people.add(new Person("John", "Smith", new Date("06/22/2001"), "123", 5.8, 170.0));
		people.add(new Person("Jane", "Doe", new Date("10/15/1999"), "123", 5.8, 170.0));

		// sort by Date of Birth in an ascending order
		List<Person> result = sort(people, "dob", "asc");

		// Render results
		for (Person p : result) {
			System.out.println(p.firstName + ' ' + p.dateOfBirth);
		}

	}

}
