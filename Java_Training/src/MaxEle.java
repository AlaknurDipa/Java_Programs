import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MaxEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int maxNo=Integer.MIN_VALUE;
        int secNo=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i] > maxNo){
                secNo=maxNo;
                maxNo=arr[i];
            }
            else if(arr[i] > secNo){
                secNo=arr[i];
            }
        }

        System.out.println("First largest "+maxNo);
        System.out.println("Second largest "+secNo);


    }
}
