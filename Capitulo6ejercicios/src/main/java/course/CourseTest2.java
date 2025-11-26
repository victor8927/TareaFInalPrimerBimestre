package course;

public class CourseTest2 {
    public static void main(String[] args) {
        
        // Crear curso base
        Course c1 = new Course("Java Basics", 5, 800.0);

        System.out.println("=== Probando CostoDescontadoPorPersona ===");
        System.out.println("Precio original: " + c1.getPricePerPerson());
        System.out.println("Precio con 10% de descuento: " + c1.discountedCostPerPerson(10));
        System.out.println("Precio con 50% de descuento: " + c1.discountedCostPerPerson(50));
        System.out.println("Descuento invalido (-5%): " + c1.discountedCostPerPerson(-5));
        System.out.println("Descuento invalido (120%): " + c1.discountedCostPerPerson(120));
    }
}