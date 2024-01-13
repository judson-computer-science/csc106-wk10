public class Human extends Animal {

	private String name;

	public Human() { }

	public Human(int weight, String name) {
		super(weight);
		this.name = name;
	}

	public void setWeight(int weight) { this.weight = weight; }

	public int getWeight() { return this.weight; }

	public void speak() {
		System.out.println("My name is " + name + " and I weigh " + weight);
	}
}
