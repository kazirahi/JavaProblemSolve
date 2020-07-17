package Problem7;

public class Senior extends Student{
String experience;
	public Senior(String name, String id) {
		super(name, id);
		this.experience="Senior";
		
	}
	void printExperience() {
		System.out.println(experience);
	}
	@Override
	public String toString() {
		return "Senior [experience=" + experience + ", name=" + name + ", id=" + id + "]";
	}

}
