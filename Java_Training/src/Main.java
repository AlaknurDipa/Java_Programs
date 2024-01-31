import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Name");
//        String name=sc.next();
//
//        System.out.println("Enter age ");
//        int age=sc.nextInt();
//        String $s;
//
//        System.out.printf("Hii"+" "+name+" "+"your age is :"+age);

//        int a=20;
//        int b=10;
//        int c=5;
//        int ans=(a+b)/(2*c);
//        System.out.println(ans);


//        System.out.println((a*a)-(b*b));


//        int d=c++;
//        System.out.println("PostIncrement "+d);
//        d=++c;
//        System.out.println("PreIncrement "+d);
//        System.out.println("////////////////////////////////////////////////////////");


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter value of base");
//        int base=sc.nextInt();
//        System.out.println("Enter value of height");
//        int height=sc.nextInt();
//
//        float area = 0.5f*base*height;
//
//        System.out.println("area of triangle is: " +area);


//        System.out.println("/////////////////");

        int a=10;
        int b=21;
        int c=13;
        double sum=(a+b+c)/2;
        double ans=Math.sqrt((sum-a)*(sum-b)*(sum-c));
        System.out.println("area is: "+ans);

        int p=5,q=4,r;
        r=2*p++ + 3 * ++q;
        System.out.println(r);

    }
}