import java.lang.Math;
public class TestSimpleCircle{
    //main method
    //Sole purpose of this method is to test the 2nd class
    public static void main (String[] args){
        //Creates a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + "is "+ circle1.getArea());
        
        //Creates a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + "is " + circle2.getArea());
        
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + "is" + circle3.getArea());
        
        circle2.radius = 100; //circle2.setradius 100
        System.out.println("The area of the circle of radius " + circle2.radius + "is " + circle2.getArea());
        
    }
}

//Define class with two constructores
class SimpleCircle {
    double radius;
    SimpleCircle(){
        radius = 1;
    }
    SimpleCircle(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    void setRadius (double newRadius){
        radius = newRadius;
    }
    
    
}
