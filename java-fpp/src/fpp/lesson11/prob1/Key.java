package lesson11.prob1;



public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	public Key() {
		
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Key p = (Key)ob;
		return p.firstName == firstName && p.lastName == lastName;
	}
	@Override
	public int hashCode() {
		int result = 17; //seed
		int hashFirst = firstName.hashCode();
		int hashSecond = lastName.hashCode();
		result += 31 * result + hashFirst;
		result += 31 * result + hashSecond;
		return result;
	}
}
