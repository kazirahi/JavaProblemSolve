package Problem7;

public class Main {

	public static void main(String[] args) {
		Cylinder value1 = new Cylinder(10,24);
		Cylinder value2 = new Cylinder(22,10);
		value2.setHeight(15);
		value1.setRadius(6);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println("Value 1 area is "+value1.getArea());
		System.out.println("Value 1 volume is "+value1.getVolume());
		System.out.println("Value 2 area is "+value2.getArea());
		System.out.println("Value 2 volume is "+value2.getVolume());
		

	}

}
