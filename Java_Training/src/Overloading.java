public class Overloading {

    static void area(int r){
        System.out.println("Area of circle: "+(3.14*r*r));
    }
    static void area(int l,int b){
        System.out.println("Area of Rectangle: "+(l*b));
    }
    static  void  area(int... a){
        if(a.length ==1){
            System.out.println("Area of circle: "+(3.14*a[0]*a[0]));
        }
        if(a.length ==2){
            System.out.println("Area of Rectangle: "+(a[0]*a[1]));
        }
    }
    public static void main(String[] args) {
        area(5);
        area(5,6);
    }
}
