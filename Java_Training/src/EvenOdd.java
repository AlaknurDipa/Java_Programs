import java.awt.*;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=sc.nextInt();
        if( a%2 ==0 ){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

        System.out.println("Enter age");
        int age=sc.nextInt();

        if(age >=14 && age<=55){
            System.out.println("You are young");
        }else if(age>55){
            System.out.println("You are old");
        }else if(age<14){
            System.out.println("You are kid");
        }

    }





}
