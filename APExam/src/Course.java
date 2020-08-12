
public class Course implements Comparable<Course>{
	private String name;
	private int numberOfStu;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfStu() {
		return numberOfStu;
	}
	public void setNumberOfStu(int numberOfStu) {
		this.numberOfStu = numberOfStu;
	}

	@Override
	public String toString() {
		return name + numberOfStu;
	}
	
	@Override
	public int compareTo(Course o) {
		return this.getName().compareTo(o.getName());
	}
	
}
