package lesson5b;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
	
	private int numberOfPublications;
	
	public Professor(String Name,double Salary, LocalDate HireDate,int NumberOfPublications)
	{
		super(Name,Salary,HireDate);
		this.numberOfPublications=NumberOfPublications;
	}

	/**
	 * @return the numberOfPublications
	 */
	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	/**
	 * @param numberOfPublications the numberOfPublications to set
	 */
	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	
}
