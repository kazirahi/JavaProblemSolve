package Problem8;

public class Irregular extends Box {

	public Irregular(double height, double width, double depth) {
		super(height, width, depth);
	}
	double getArea() {
		return 2*((height*width)+(width*depth)+(depth*height));
	}
	double getVolume() {
		return height*width*depth;
	}
	@Override
	public String toString() {
		return "Irregular [height=" + height + ", width=" + width + ", depth=" + depth + ", getArea()=" + getArea()
				+ ", getVolume()=" + getVolume() + "]";
	}
	

}
