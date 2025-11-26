package course;

/**
 * The Course class represents a training course definition,
 * not an individual delivery of the course.
 * Includes name, duration, price and maximum number of participants.
 * 
 * This class demonstrates constructors, method chaining,
 * setters with validation, and JavaDoc usage.
 * 
 * @author Victor
 * @version 1.1
 */
public class Course {

    private String name;
    private int numberOfDays;
    private double pricePerPerson;
    private int maximumParticipants;
   
    /**
     * Zero-arguments constructor.
     * Initializes the course with default values.
     */
    public Course() {
        this("Unnamed Course", 3, 1000.0, 20);
    }

    /**
     * Constructor without maximum participants (old version for compatibility).
     * @param name The name of the course
     * @param days The length of the course in days
     * @param price The cost of the course per person
     */
    public Course(String name, int days, double price) {
        this(name, days, price, 20);  // default max participants
    }

    /**
     * New constructor including maximum participants attribute.
     * @param name The name of the course
     * @param days Number of days the course lasts
     * @param price Price per person
     * @param maxParticipants Maximum number of allowed participants
     */
    public Course(String name, int days, double price, int maxParticipants) {
        setName(name);
        setNumberOfDays(days);
        setPricePerPerson(price);
        setMaximumParticipants(maxParticipants); // use setter for validation
    }

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
     * @return The number of days the course lasts
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the number of days the course lasts.
     * Must be between 1 and 10.
     * @param numberOfDays The duration in days
     */
    public void setNumberOfDays(int numberOfDays) {
        if (numberOfDays >= 1 && numberOfDays <= 10) {
            this.numberOfDays = numberOfDays;
        } else {
            System.out.println("Invalid number of days. Must be between 1 and 10.");
        }
    }

    /**
     * @return The price per person
     */
    public double getPricePerPerson() {
        return pricePerPerson;
    }

    /**
     * @param pricePerPerson Price per participant
     */
    public void setPricePerPerson(double pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }

    /**
     * @return The maximum number of participants allowed
     */
    public int getMaximumParticipants() {
        return maximumParticipants;
    }

    /**
     * Setter with consistency validation.
     * Ensures the value is positive.
     * @param maximumParticipants Maximum participants
     */
    public void setMaximumParticipants(int maximumParticipants) {
        if (maximumParticipants > 0) {
            this.maximumParticipants = maximumParticipants;
        } else {
            System.out.println("Maximum participants must be > 0. Value not changed.");
        }
    }
    
    /**
     * Calculates the discounted cost per person based on a given percentage.
     * @param percentDiscount The discount percentage to apply (0–100)
     * @return The discounted price per person
     */
    public double discountedCostPerPerson(int percentDiscount) {
        if (percentDiscount < 0 || percentDiscount > 100) {
            // Value not allowed → not apply discount
            return pricePerPerson;
        }
        return pricePerPerson - (pricePerPerson * percentDiscount / 100.0);
    }
    
    
    
    
    
    
    
    
}

