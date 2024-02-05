import java.awt.geom.Area;

class Rectangle{
    int l;
    int b;
    public void area(){
        System.out.println("Area is: "+(l*b));
    }
    public void perimeter(){
        System.out.println("Perimeter: "+(2*(l+b)));
    }

    public boolean isSquare(){
        if(l==b){
            return true;
        }
        return false;
    }


}
public class RectangleExample {

    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
        rect.b=10;
        rect.l=5;
        rect.area();
        rect.perimeter();
        System.out.println("Is square? :"+rect.isSquare());

    }
}



