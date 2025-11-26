package snakeandladders;

public class Course {

    private String name;
    private int numberOfDays;
    private double pricePerPerson;

    // Array de módulos
    private Module[] modules = new Module[20];
    private int moduleCount = 0;

    // Constructor
    public Course(String name, int days, double price) {
        this.name = name;
        this.numberOfDays = days;
        this.pricePerPerson = price;
    }

    // Agregar módulo
    public void addModule(Module new_module) {
        if (moduleCount < modules.length) {
            modules[moduleCount] = new_module;
            moduleCount++;
        } else {
            System.out.println("Cannot add more modules");
        }
    }

    // Total de créditos
    public int getTotalCredits() {
        int total = 0;
        for (int i = 0; i < moduleCount; i++) {
            total += modules[i].getCreditPoints();
        }
        return total;
    }

    // Getters de módulos
    public Module[] getModules() {
        return modules;
    }

    public int getModuleCount() {
        return moduleCount;
    }

    // Getters básicos
    public String getName() {
        return name;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getPricePerPerson() {
        return pricePerPerson;
    }
}

