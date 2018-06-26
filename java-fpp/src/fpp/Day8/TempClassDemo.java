package Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class Person1{
	
	private int age;
	private String name;
	
	public Person1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "[age=" + age + ", name=" + name + "]";
	}
	
	
}
public class TempClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> slist = new ArrayList();
		
		ArrayList<Integer> llist = new ArrayList(Arrays.asList(10,30,50,40));
		//System.out.println(llist);
		slist.add("Java");
		slist.add("SE");
		slist.add("Android");
		slist.add("MPP");
		slist.add(1, "C#");
		slist.add("Advanced Java");
		
		Iterator<String> ob = slist.iterator();
		int count =0;
		while(ob.hasNext()){
			String n = ob.next();
			if(n.charAt(0)=='A')
				count++;				
		}
		System.out.println("Count :" + count);
		
	/*	System.out.println("Before Sort : " + slist);
		Collections.sort(slist);
		System.out.println("After Sort : " + slist);
		int x = Collections.binarySearch(slist, "WAP");
		System.out.println("Position of WAP : " + x);
		Collections.sort(slist,Collections.reverseOrder());*/
		//System.out.println("reversed Sort : " + slist);
		
		
		
	/*	System.out.println(slist);
		System.out.println(slist.size());
		System.out.println(slist.get(1));
		slist.set(1, "Software Engineering");
		System.out.println(slist);
		slist.remove(0);
		slist.remove("MPP");
		System.out.println(slist);
		System.out.println(slist.isEmpty());
		
		slist.clear();
		System.out.println(slist.isEmpty());
		ArrayList<Person1> plist = new ArrayList();
		Person1 luk = new Person1(24,"Lukman");
		Person1 sri = new Person1(22,"Sree Ram");
		Person1 bite = new Person1(27,"Bite");
		
		ArrayList<Person1> pl = new ArrayList(Arrays.asList(luk,sri,bite));
		plist.add(luk);
		System.out.println(plist);
		plist.addAll(pl);
		System.out.println(plist);*/
		
	}

}
