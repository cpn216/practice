//Find the number of each digit in a string
import java.util.Scanner;
public class occuranceDigit{
    public static void main(String args [] ){
        System.out.println("Enter a string. Program finds the occurance of digits");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int [] x = count(num);
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i]+" ");
        }
        
    }
    public static int [] count(String s){
        char [] counted = {'0','1','2','3','4','5','6','7','8','9'};
        //Chars have to be == to be compared. comparing to see if digits and chars match up
        int[]counts = new int[10];
        int number = -1;
        for (int i = 0; i < 10; i++){
            for (int j =0; j < s.length(); j++){
            if(Character.isDigit(s.charAt(j))){
                if(counted[i]==(s.charAt(j))){
                    counts[i]++;
                }
            }
            }
        }
            return counts;
        } 
    }
