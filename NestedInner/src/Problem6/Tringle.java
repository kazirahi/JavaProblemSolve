package Problem6;

public class Tringle {
	double base;
	double height;
	double getArea() {
		return (base*height)/2;
	}
	public Tringle(double base, double height) {
		
		this.base = base;
		this.height = height;
	}
	public Tringle() {
		
		this.base = 0;
		this.height = 0;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Tringle [base=" + base + ", height=" + height + "]";
	}
	

}
