package Problem8;

public class Cube extends Box {

	double len;

	public Cube(double lenn) {
		super(lenn);
		len=lenn;
		
	}

	double getArea() {
		
		return 6 * len * len;
	}

	double getVolume() {
		return height * width * depth;
	}

	@Override
	public String toString() {
		return "Cube [length=" + len + ", getArea()=" + getArea() + ", getVolume()=" + getVolume() + "]";
	}

	

}
