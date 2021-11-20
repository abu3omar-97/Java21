package Shapes;

public class Square {
    // WHAT IT HAS?
    String name;
    public int width;
    public int height;
    double area;

    public Square(int width){
        this.width = width;
        this.name = "A";
    }

    public Square(){
        System.out.println("C2");
    }

    public Square(int width, String name){
        System.out.println("C3");

    }

    public double getArea(){
        System.out.println("GET AREA");
        return this.height * this.width;
    }

}
