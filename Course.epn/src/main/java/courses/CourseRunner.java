package courses;

public class CourseRunner {
	public static void main(String[] args)
	{
	CourseExample javaCourse = new CourseExample();
	javaCourse.setName("Java");
	javaCourse.setNumberOfDays(3);
	javaCourse.setPricePerPerson(1000.0);
	System.out.println(javaCourse.getName() +
	" course lasts " + javaCourse.getNumberOfDays() +
	" days and costs " + javaCourse.getPricePerPerson());
	}
}
