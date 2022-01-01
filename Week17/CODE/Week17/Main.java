package Week17;

import GeometricPackage.Circle;
import GeometricPackage.GeometricObject;
import GeometricPackage.Rectangle;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        GeometricObject myGeoObj = new GeometricObject();
        GeometricObject myCirObj = new Circle();
        Rectangle myRecObj = new Rectangle();

        myGeoObj.printDetails();
        myCirObj.printDetails();
        myRecObj.printDetails();

    }


    public static void printShapeColors(GeometricObject geoObj){
        System.out.println(geoObj.getColor());
    }

    public static void printShapesColors(GeometricObject geoObj[]){
        for (int i = 0; i < geoObj.length; i++) {
            printShapeColors(geoObj[i]);
        }
    }

    public static int getValues(int a , double b){
        return 1;
    }
    public static int getValues(double a , int b){
        return 1;
    }
}
