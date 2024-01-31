import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub1,sub2,sub3;
        System.out.println("Enter subject1 marks");
        sub1=sc.nextInt();
        System.out.println("Enter subject2 marks");
        sub2=sc.nextInt();
        System.out.println("Enter subject3 marks");
        sub3=sc.nextInt();

        int avg = (sub1+sub2+sub3)/3;
        if(avg>=70){
            System.out.println(avg + " Grade - A");
        } else if(avg>=60 && avg<=69){
            System.out.println(avg +" Grade - B");
        }else if(avg>=50 && avg<=59){
            System.out.println(avg +" Grade - C");
        }else if(avg>=40 && avg<=49){
            System.out.println(avg +" Grade - D");
        }else if(avg<40){
            System.out.println(avg +" Grade - E");
        }





//        int day=sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case  7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Enter valid day");

        }
    }

