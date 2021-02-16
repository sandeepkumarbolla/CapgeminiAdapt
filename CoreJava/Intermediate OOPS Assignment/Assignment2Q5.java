import java.lang.*;
import java.util.*;

public class Assignment2Q5{
    public static void main(String[] args) {

    	Rectangle obj1= new Rectangle();
    	System.out.println(obj1.draw());

    	Line obj2= new Line();
    	System.out.println(obj2.draw());

    	Cube obj3= new Cube();
    	System.out.println(obj3.draw());
    }
}

class Rectangle extends Shape {
    @Override
    public String draw() {return ("Rectangle class");}
}

class Line extends Shape{
    @Override
    public String draw() {return ("Line class");}
}

class Cube extends Shape {
    @Override
    public String draw() {return ("Cube class");}
}
abstract class Shape {
    abstract public String draw();
}
