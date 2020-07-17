package Problem7;

public class Cylinder {
	double radius;
	double height;
	double getArea() {
		return ((2*3.1416*radius*height)+(2*3.1416*radius*radius));
	}
	double getVolume() {
		return (3.1416*radius*radius*height);
	}
	public Cylinder(double radius, double height) {
		
		this.radius = radius;
		this.height = height;
	}
	public Cylinder() {
		
		this.radius = 0;
		this.height =0;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String toString() {
		return "Cylinder [radius=" + radius + ", height=" + height + "]";
	}

}
