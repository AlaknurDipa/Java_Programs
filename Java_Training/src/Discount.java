import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of item purchased");
        int noOfItems=sc.nextInt();
        int total=0;
        for(int i=0;i<noOfItems;i++){
            System.out.println("enter price of item "+(i+1));
            total+=sc.nextInt();
        }


        System.out.println("Total: "+total);
        double finalAmount=0;
        if(total<500){
            finalAmount = total -(0.05*total);

        }else if(total >=600 && total<=1000){
            finalAmount = total - (0.1*total);

        } else if (total >1000) {
            finalAmount = total -(0.15*total);

        }
        System.out.println("Final Amount :"+ finalAmount);

    }
}


