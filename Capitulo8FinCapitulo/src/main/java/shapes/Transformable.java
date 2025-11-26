package shapes;

public interface Transformable {

    void switchDimensions();

    default void resizeBy(double scaleFactor) {
    	
    }
    
}
