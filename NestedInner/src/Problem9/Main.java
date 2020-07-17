package Problem9;

public class Main {

	public static void main(String[] args) {
		Cube value1= new Cube(55);
		Cube value2= new Cube(55);
		value1.setLength(25);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println("Value 1 area is " + value1.getArea());
		System.out.println("Value 1 volume is " + value1.getVolume());
		System.out.println("Value 2 area is " + value2.getArea());
		System.out.println("Value 2 volume is " + value2.getVolume());
	}

}
