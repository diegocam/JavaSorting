import java.util.*;

public class Person {
	String ssn;
	Date dateOfBirth;
	String firstName;
	String lastName;
	Double heightIn;
	Double weightLb;
	
	public Person(String firstName, String lastName, Date dob, String ssn, Double heightIn, Double weightLb) {
		this.ssn = ssn;
		this.dateOfBirth = dob;
		this.firstName = firstName;
		this.lastName = lastName;
		this.heightIn = heightIn;
		this.weightLb = weightLb;
	}

}
