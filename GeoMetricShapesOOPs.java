import java.util.*;

class GeoMetricShapesOOPs {
  
  public static void main (String[] args) {
    Shape c = new Circle(5);
    System.out.println("Radius of the circle " + c.CalArea());
  }
}

abstract class Shape
{
  abstract double CalArea();
  //abstract void displayShape();
  
}

class Circle extends Shape{
  double radius;
  Circle(double radius){
    this.radius = radius;
  }
  double CalArea(){
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape{
  double length;
  double width;
  Rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }
  double CalArea(){
    return  length * width;
  }
}
