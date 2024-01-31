import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0){
            int r=num%10;
            if(r==1){
                System.out.println(num%10+":One");
            }else if(r==2){
                System.out.println(num%10+":Two");
            }else if(r==3){
                System.out.println(num%10+":Three");
            } else if (r==4) {
                System.out.println(num%10+":Four");
            }else if(r==5){
                System.out.println(num%10+":Five");
            }else if(r==6){
                System.out.println(num%10+":Six");
            }else if(r==7){
                System.out.println(num%10+":Seven");
            } else if (r==8) {
                System.out.println(num%10+":Eight");
            } else if (r==9) {
                System.out.println(num%10+":Nine");
            }else{
                System.out.println(num%10+":Zero");
            }
            num=num/10;
        }
    }
}
