import java.util.Random;

public class classPractice{
    //program to practice the use of classes and object
    public static void main(String [] args){
        Count myCount = new Count();
        int times = 0;
        
        for (int i = 0; i < 100; i++){
            increment(myCount, times);
        }
        
        System.out.println("count is "+ myCount.count);
            System.out.println("times is "+ times);
        }
        
        public static void increment(Count c, int times){
            c.count++;
            times++;
        }
        
      
}

