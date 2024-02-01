public class EmailValidation {
    public static void main(String[] args) {
        String s="pqr2@gmail.com";
        String email="[A-za-z_0-9]*@[A-Za-z]*.[a-zA-Z]*";
        if(s.matches(email)){
            int in =s.indexOf("@");
            System.out.println(s.substring(0,in));
        }



    }
}
