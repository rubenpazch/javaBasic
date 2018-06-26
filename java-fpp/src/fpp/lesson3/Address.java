package lesson3;

public class Address {
	//street, city, state and zip
			//properties
			
	private String street;
	private String city;
	private String state;
	private String zip;
			
			
			
	public Address (String street,String city,String state,String zip) {
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip=zip;
	}
		
	public Address()
	{
		this.street=null;
		this.city=null;
		this.state=null;
		this.zip=null;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
}
