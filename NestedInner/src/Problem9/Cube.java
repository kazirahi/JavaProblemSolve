package Problem9;

public class Cube {
	double length;
	double getArea() {
		return 6*length*length;
	}
	double getVolume() {
		return length*length*length;
	}

	public Cube(double length) {
		
		this.length = length;
	}

	public Cube() {
		
		this.length = 0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}



	public String toString() {
		return "Cube [length=" + length + "]";
	}
	

}
