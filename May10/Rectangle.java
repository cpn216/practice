//Assignment 8.1
public class Rectangle{
     public static void main (String[] args){
        //Creates a circle with radius 1
        designRectangle rect1 = new designRectangle();

        System.out.println("The width : " + rect1.width + "the height : " + rect1.height + "the area : " + rect1.getArea() + "the perimeter : " + rect1.getPerimeter()+"");
        
        
    }
}

class designRectangle{
      double height;
      double width;
      
    designRectangle(){
        height = 1;
        width = 5;
    }
    designRectangle(double nheight, double nwidth){
        height = nheight;
        width = nwidth;
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return 2*width + 2*height;
    }
}