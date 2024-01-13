import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		Dog rover = new Dog();
		Dog chase = new Dog(10);

		Parrot perry = new Parrot(1);
		Human patrick = new Human(100, "Patrick");

		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(rover);
		animals.add(chase);
		animals.add(perry);
		animals.add(patrick);

		for(Animal animal : animals) {
			animal.speak();
		}
	}
}
