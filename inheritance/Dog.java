public class Dog extends Animal {

	public Dog() { }

	public Dog(int weight) { super(weight); }

	public void setWeight(int weight) { this.weight = weight; }

	public int getWeight() { return this.weight; }

	public void speak() { System.out.println("woof"); }
}
