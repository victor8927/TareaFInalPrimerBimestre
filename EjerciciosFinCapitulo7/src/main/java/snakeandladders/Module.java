package snakeandladders;

public class Module {

    private String name;
    private int creditPoints;
    private String assessment;

    // Constructor
    public Module(String name, int points, String assess) {
        setName(name);
        setCreditPoints(points);
        setAssessment(assess);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCreditPoints(int creditPoints) {
        this.creditPoints = creditPoints;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public String getAssessment() {
        return assessment;
    }
}


