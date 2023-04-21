package lab3;

abstract class Shape{
	abstract double CalculateArea();
}
class Circle extends Shape{
    double r;
    public Circle(double r) {
		this.r=r;
	}
	@Override
	double CalculateArea() {
		double area = (3.14*r*r); 
		return area;
	}
	
}
class Rectangle extends Shape{

   double l,b;
	@Override
	double CalculateArea() {
		return l*b;
		
	}
	public Rectangle(double l,double b) {
		this.l=l;
		this.b=b;
	}
	
}
public class Abstraction1 {

	public static void main(String[] args) {
		Circle x = new Circle(10);
	    System.out.println("Area Of Circle is : "+x.CalculateArea());
	   
	    
	    Rectangle y = new Rectangle(5,15);
	    System.out.println("Area of Rectangle is : "+y.CalculateArea());
	    
		
	}

}
