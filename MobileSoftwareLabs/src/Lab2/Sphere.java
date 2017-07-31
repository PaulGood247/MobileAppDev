package Lab2;

public class Sphere extends Shape implements ThreeDShape {

	private double v, r;
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getV() {
		return v;
	}
	public double getPi() {
		return pi;
	}

	private double pi = 3.14;
	
	public Sphere( double r )
	{
		this.r=r;
	}
	public double volume()
	{
		v=4/3*pi*r*r;
		return v;
	}
	
	public double area()
	{
		return 4*pi*r*r;
	}
	@Override
	public String toString() {
		return "Sphere [v=" + volume() + " area=" + area() + ", r=" + r + ", pi=" + pi + "]";
	}
	
	
	
	
}