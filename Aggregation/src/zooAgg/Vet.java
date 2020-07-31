package zooAgg;

public class Vet {

	private String firstName;
	private String lastName;
	
	public Vet(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
}