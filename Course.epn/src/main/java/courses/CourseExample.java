package courses;

	/**
	 * The Course class represents a training course definition,
	 * not an individual delivery of the course
	 * @author Victor
	 * @version 1.1 
	 *
	 */


	public class CourseExample{
	
		
	/**
	* zero arguments constructor
	*/
	
		
	public CourseExample(){
	this("Unnamed Course", 3, 1000.0);
	}	
		
	//Chaining Constructors
	
	/**
	* Parameterized constructor
	* @param name The name of the course
	* @param days The length of the course in days
	* @param price The cost of the course per person
	*/
	public CourseExample(String name, int days, double price)
	{
	setName(name);
	setNumberOfDays(days);
	setPricePerPerson(price);
	}	
		
	
	private String name;
	private int numberOfDays;
	private double pricePerPerson;
	
	
	/**
	* @return The name of the course
	*/
	public String getName() {
	return name;
	}
	
	
	/**
	* @param name The name of the course
	*/
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	* @return The length of the course
	*/
	public int getNumberOfDays() {
		return numberOfDays;
	}
	
	
	/**
	* @param numberOfDays The number of days the course lasts
	*/
	public void setNumberOfDays(int numberOfDays){
	if(numberOfDays >= 1 && numberOfDays <=10)
	{this.numberOfDays = numberOfDays;
	}else
	{
	// do not accept the parameter value
	// should probably throw an exception (see Chap. 9)
		}
	}

	/**
	* @return The price of the course per person
	*/
	public double getPricePerPerson() {
		return pricePerPerson;
	}

	
	/**
	* @param price The price of the course per person
	*/
	public void setPricePerPerson(double pricePerPerson) {
		this.pricePerPerson = pricePerPerson;
		}
	}
	
	
	
	
	
	
	
	
	
	
	


