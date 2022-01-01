package GeometricPackage;

public class GeometricObject {
    private String color;
    private boolean isFilled;
    private Position objectPosition;

    public GeometricObject(String color, boolean isFilled, int x, int y) {
        this.color = color;
        this.isFilled = isFilled;
        this.objectPosition = new Position(x,y);
    }

    public GeometricObject() {
        this("WHITE", true, 0,0);
        System.out.println("GEO OBJECT");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Position getObjectPosition() {
        return objectPosition;
    }

    public void setObjectPosition(Position objectPosition) {
        this.objectPosition = objectPosition;
    }

    public void printDetails(){
        System.out.println("I'M INSIDE THE GEO OBJ");
    }

}
