import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        a=sc.nextInt();
        System.out.println("Enter value of b:");
        b=sc.nextInt();
        System.out.println("Enter value of b:");
        c=sc.nextInt();


        double r1=( -b + Math.sqrt((b*b) - 4*a*c ))/2*a;
        double r2=( -b - Math.sqrt((b*b) - 4*a*c ))/2*a;

        System.out.println("roots are: "+r1+","+r2);

    }
}
