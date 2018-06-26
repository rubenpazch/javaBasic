
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person(); // default Constructor
		p1.diplayPerson();
		
		Person p2 = new Person("John","Male",25);
		p2.diplayPerson();
		p2.setName("JohnDavid");
		p2.diplayPerson();
		

	}

}
