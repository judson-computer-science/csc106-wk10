public class Animal {

	protected int weight;

	public Animal() {
		System.out.println("creating Animal with no weight");
	}

	public Animal(int weight) {
		System.out.println("creating Animal with weight " + weight);
		this.weight = weight;
	}

	public void speak() {
		System.out.println("Hello");
	}
}
