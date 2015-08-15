//Write code that checks password for conditions
// at least 8 chars
// digits and letters only
// at least 2 digits
import java.util.Scanner;

public class Strings3 {
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a password that qualifies all the conditions");
        boolean conditions = true;
        String password = scan.nextLine();
        if(password.length() < 8){
            conditions = false;
        }
        int digits = 0 ;
        for (int i = 0; i < password.length(); i++){
            if (Character.isLetterOrDigit(password.charAt(i))){
                if (Character.isDigit(password.charAt(i))){
                    digits++;
                }
            }
            else{
                conditions = false;
            }
        }
        if(digits < 2){
            conditions = false;
        }
        if (conditions == false){
            System.out.println("INVALID PASSWORD");
        }
        else{
            System.out.println("VALID PASSWORD");
        }
    }
}