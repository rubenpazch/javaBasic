package lesson5g;

import Day4.CloneExp;

public class Person implements Cloneable {
	private String Name;
	private Computer computer;
	
	public Person ()
	{}
	
	public Person (String oName, Computer oComputer)
	{
		this.Name=oName;
		this.computer=oComputer;
	}
	
	 public String toString()
	  {
		  String ot = "Name : "+this.Name + " Computer : "+ this.computer.toString();
	      return ot; 
	  }
	 
	 public Object clone() throws CloneNotSupportedException {

		 Person clone=(Person)super.clone();
		    
		    return clone;

		  }
	 
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the computer
	 */
	public Computer getComputer() {
		return computer;
	}
	/**
	 * @param computer the computer to set
	 */
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	 
	 
}
