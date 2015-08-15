//Program that finds occurance of a specified character in string
import java.util.Scanner;
public class occurance{
public static void main(String args[]){
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter a string followed by a character.");
    String str = scan.nextLine();
    char a = scan.next().charAt(0);
    int number = count(str,a);
    System.out.println("The occurance of the character is "+ number);
    
   
    
}
 public static int count(String str, char a){
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            if((str.charAt(i)) == a){
               counter++; 
            }
        } return counter;
    }
}