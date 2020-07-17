package Problem4;

public class Student {

	String name;
	String email;
	Double cgpa;
	
	public Student(String name, String email, Double cgpa) {
		
		this.name = name;
		this.email = email;
		this.cgpa = cgpa;
	}
	public Student() {
		
		this.name = "";
		this.email = "";
		this.cgpa = 0.0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [name: " + name + ", email:" + email + ", cgpa:" + cgpa + "]";
	}
	
	
}
