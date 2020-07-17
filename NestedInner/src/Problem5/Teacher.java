package Problem5;

public class Teacher {

	String name;
	String email;
	String designation;
	public Teacher(String name, String email, String designation) {
		super();
		this.name = name;
		this.email = email;
		this.designation = designation;
	}
	public Teacher() {
		
		this.name = "";
		this.email = "";
		this.designation = "";
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", email=" + email + ", designation=" + designation + "]";
	}
	
	
	
}
