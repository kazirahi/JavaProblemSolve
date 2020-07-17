package Problem5;

public class Main {

	public static void main(String[] args) {
		Teacher Aahan = new Teacher("Aahan","Aahan@gmail.com", "A. Professor");
		Teacher Arisha = new Teacher("Aahan","Aahan@gmail.com", "A. Professor");
		Arisha.setDesignation("Lecturer");
		Arisha.setEmail("Arisha1234@gmail.com");
		Arisha.setName("Arisha");
		Aahan.setDesignation("VC");
		Aahan.setEmail("Aahan1234@gmail.com");
		System.out.println(Aahan);
		System.out.println(Arisha);
		System.out.println(Aahan.getDesignation());
	}

}
