//Person

public class Person{
    static int samAge = 12;
    public Person(String name) {
    System.out.println("The person's name is "+ name);
    }
    public int inceaseAge(int x){
        samAge += x;
        return samAge;
    }
    public static void main(String args[]){
        Person sam = new Person("sam");
        System.out.println(samAge);
        sam.inceaseAge(10);
        System.out.println(samAge);
    }
}