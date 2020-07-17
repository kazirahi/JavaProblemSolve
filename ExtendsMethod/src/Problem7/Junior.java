package Problem7;

public class Junior extends Student {
	String experience;
	public Junior(String name, String id) {
		super(name, id);
		this.experience="Junior";
		
	}
	void printExperience() {
		System.out.println(experience);
	}
	@Override
	public String toString() {
		return "Junior [experience=" + experience + ", name=" + name + ", id=" + id + "]";
	}
	

}
