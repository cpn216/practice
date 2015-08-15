//Create a program that checks for the password
//must have at least 8 characters
//must consist of only letters and numbers
//password must contain at least two digits
import java.util.Scanner;
public class Strings2{
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password that meets the conditions");
        String password = scan.nextLine();
        boolean conditions = true;
        int digit = 0;
        for(int i = 0; i < password.length();i++){
            if(Character.isLetterOrDigit(password.charAt(i))){
                if(Character.isDigit(password.charAt(i))){
                digit++;
            }
            }
            else{
                conditions = false;
            }
        }
         if (password.length() < 8 || digit < 2){
            conditions = false;
        }
        if(conditions == false){
            System.out.println("Invalid Password");
        }
        else{
            System.out.println("Valid Password");
        }
    }

}