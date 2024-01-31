import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of skip");
        int skip=sc.nextInt();
        System.out.println("Enter value of stop");
        int stop=sc.nextInt();

        for(int i=1;i<=100;i++){
            if(stop == i){
                break;
            }
            else if(skip==i){
                continue;
            }
            System.out.println(i);


        }
    }
}
