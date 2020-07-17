package Problem8;

public class Sphere {
	double radius;

	double getArea() {
		return 4 * 3.1416 * radius * radius;
	}

	double getVolume() {
		return (4 * 3.1416 * radius * radius * radius) / 3;
	}

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	public Sphere() {

		this.radius = 0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Sphere [radius=" + radius + "]";
	}

}
