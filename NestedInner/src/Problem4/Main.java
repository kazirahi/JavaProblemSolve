package Problem4;

public class Main {

	public static void main(String[] args) {
		Student Aahan = new Student("AAHAN","AAHAN@gmail.com",3.98);
		Student Arisha = new Student("AAHAN","AAHAN@gmail.com",3.98);
		Arisha.setCgpa(3.5);
		Arisha.setName("Arisha");
		Arisha.setEmail("Arisha@gmail.com");
		Aahan.setCgpa(3.78);
		System.out.println(Aahan);
		System.out.println(Arisha);
		System.out.println(Arisha.getEmail());

	}

}
