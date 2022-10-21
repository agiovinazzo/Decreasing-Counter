package alessia.decreasingCounter.classe;

public class Person {

	private String name;
	private int age;
	private double height;
	private int weight;
	
	
	
	public Person(String name, int age, double height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
}
