package Problem8;

public class Main {

	public static void main(String[] args) {
		Sphere value1 = new Sphere(10);
		Sphere value2 = new Sphere(10);
		value2.setRadius(5);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println("Value 1 area is " + value1.getArea());
		System.out.println("Value 1 volume is " + value1.getVolume());
		System.out.println("Value 2 area is " + value2.getArea());
		System.out.println("Value 2 volume is " + value2.getVolume());

	}

}
