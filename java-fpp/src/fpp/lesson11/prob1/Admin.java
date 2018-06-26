package lesson11.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> hm = new HashMap<>();
		Key k = null;
		if(students ==null)
			return null;
		else			
			for (Student student : students) {
				k = new Key(student.getFirstName(),student.getLastName());
				hm.put(k, student);
			}
		return hm;
	}
}
