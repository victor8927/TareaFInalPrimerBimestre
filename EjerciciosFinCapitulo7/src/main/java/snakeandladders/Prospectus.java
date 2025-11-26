package snakeandladders;

public class Prospectus {

	private Course[] courses = new Course[50];
    private int courseCount = 0;

    public void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            courseCount++;
        } else {
            System.out.println("No more courses can be added.");
        }
    }

    public Course[] getCourses() {
        return courses;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void showProspectus() {
        System.out.println("Prospectus contains the following courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("- " + courses[i].getName());
        }
    }
}