import java.util.Scanner;

public class Prime {
    public static int  isPrime(int number){
        int flag = 0;
        for (int i=2;i<number;i++){
            if(number % i ==0){
                return 1;

            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if(isPrime(number)==1){
            System.out.println("Number is not prime");
        }else {
            System.out.println("Number is prime");
        }
    }
}
