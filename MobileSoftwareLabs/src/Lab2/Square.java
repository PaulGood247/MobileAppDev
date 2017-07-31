package Lab2;

public class Square extends Shape {

	public Square(double x, double y)
	{
		super();
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Square [x=" + x + ", y=" + y + ", area=" + area() + "]";
	}
	
	public double getX()
	{
		return super.x;
	}
	
	public double area()
	{
		area=x*y;
		return area;
	}
	
}
