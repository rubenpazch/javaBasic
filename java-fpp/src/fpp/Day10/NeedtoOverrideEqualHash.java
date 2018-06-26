package Day10;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person{
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [ " + name + " " + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object o){
		if(o==null) return false;
		if(!(o instanceof Person)) return false;
		Person p = (Person) o;
		if(this.name.equals(p.name) && this.age==p.age) return true;
		else 
			return false;
				
	}
	@Override 
	public int hashCode(){
	/*	int hc = 11;
		hc += name.hashCode() + (int)age;  
		return 23 + hc;*/
		return Objects.hash(name,age);
	}
		
}
public class NeedtoOverrideEqualHash {
 public static void main(String args[]){
	 Set<Person> set = new HashSet();
	 Person  p1 = new Person("David",23);
	 Person  p2 = new Person("David",23);
	 Person  p3 = new Person("Anne",25);
	 set.add(p1);
	 set.add(p2);
	 set.add(p3);
	 Person look = new Person("David",23);
	 System.out.println(p1.equals(look));
	 System.out.println(set.contains(look));
	 set.forEach((x)->System.out.println(x));
	 set.forEach((x)->System.out.println("Hashcode : " + x.hashCode()));

 
 }
}
