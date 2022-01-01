package GeometricPackage;

public class Rectangle extends GeometricObject {
    public double width;
    public double height;

    public Rectangle() {
                this.setColor("ORANGE");
    }

    @Override
    public void printDetails() {
        System.out.println("IM IN RECT");
    }
}
