public class pattern {
    public static void main(String[] args) {
//        int cnt=1;
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(cnt+" ");
//                cnt++;
//            }
//            System.out.println();
//        }


        for(int i=1;i<6;i++){
            for(int j=1;j<6-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
