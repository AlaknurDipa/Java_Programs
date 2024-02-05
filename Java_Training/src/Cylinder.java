//        radius
//        height
//        area pi*r*r
//        perimeter 2*pi*r
//        volume area*h

import org.w3c.dom.UserDataHandler;

class Shape{

    private int radius;
    private int height;
    Shape(){

    }
    Shape(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
    public int getRadius(){
        return radius;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
    public double volume(){
        return area()*height;
    }



}
public class Cylinder {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.setHeight(5);
        shape.setRadius(5);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        System.out.println(shape.volume());

    }
}
