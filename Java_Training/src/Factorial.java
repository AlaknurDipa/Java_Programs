import java.awt.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=1;
        for(int i=1;i<=num;i++){
            ans=ans*i;
        }
        System.out.println("factorial is : "+ans);


    }
}
