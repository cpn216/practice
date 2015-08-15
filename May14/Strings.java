//reproduce problem 1 and 2 without looking at any references
//Write a program that prompts social security number. checks if valid or invalid
import java.util.Scanner;
public class Strings{
    public static void main(String args [] ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a social secutity number in format DDD-DD-DDDD");
        String s = scan.nextLine();
        boolean status = true;
        for (int i = 0; i < s.length(); i++){
            if (i == 3 || i == 6){
                continue;
            }
            if (Character.isDigit(s.charAt(i))){
                
            }
            else{
                status = false;
            }
        }
        if (s.length() < 11){
            status = false;
        }
        if(status == false){
            System.out.println("Invalid SS");
        }
        else{
            System.out.println("Valid SS");
        }
    }
    
}