import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int row=sc.nextInt();
        System.out.println("Enter col");
        int col=sc.nextInt();

        int a[][]=new int[row][col];
        int b[][]=new int[row][col];

        System.out.println("Enter Elements for matrix A");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Elements for matrix B");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]=sc.nextInt();
            }
        }

        int c[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j]=a[i][j]+ b[i][j];
            }
        }

        for(int x[]:c){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
