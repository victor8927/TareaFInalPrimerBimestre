package course;

/**
 * Test class for the Course class.
 * Creates instances and exercises all methods.
 * @author Victor
 */
public class TestCourse {

    public static void main(String[] args) {

        System.out.println("== Probando constructor por defecto===");
        Course c1 = new Course();
        System.out.println("Curso 1: " + c1.getName() + ", Dias: " + c1.getNumberOfDays()
                + ", Precio: " + c1.getPricePerPerson()
                + ", Max participantes: " + c1.getMaximumParticipants());

        System.out.println("\n=== Probando constructor sin maximos participantes ===");
        Course c2 = new Course("Java Basics", 5, 1500.0);
        System.out.println("Curso 2: " + c2.getName() + ", Dias: " + c2.getNumberOfDays()
                + ", Precio: " + c2.getPricePerPerson()
                + ", Max participantes: " + c2.getMaximumParticipants());

        System.out.println("\n=== Probando nuevo constructor con maximos participantes ===");
        Course c3 = new Course("Python Advanced", 7, 2000.0, 30);
        System.out.println("Curso 3: " + c3.getName() + ", Dias: " + c3.getNumberOfDays()
                + ", Precio: " + c3.getPricePerPerson()
                + ", Max participantes: " + c3.getMaximumParticipants());

        System.out.println("\n=== Testing setter validation ===");
        c3.setMaximumParticipants(-5); // Should print error
        System.out.println("Course 3 (after invalid update): " + c3.getMaximumParticipants());

        c3.setMaximumParticipants(25); // Valid
        System.out.println("Course 3 (after valid update): " + c3.getMaximumParticipants());
    }
}