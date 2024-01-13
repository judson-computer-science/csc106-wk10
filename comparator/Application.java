import java.util.ArrayList;

public class Application {

	public static void main(String args[]) {

		ArrayList<Sphere> list = new ArrayList<>();

		list.add(new Sphere(8));
		list.add(new Sphere(10));
		list.add(new Sphere(2));
		list.add(new Sphere(3));

		printList(list);
		list.sort(new MaxVolumeComparator());
		System.out.println("");
		printList(list);
	}

	private static void printList(ArrayList<Sphere> list) {

		for(Sphere sphere : list) {
			System.out.println("Sphere #" + sphere.getNumber() + " (Max Volume: " + sphere.getMaxVolume() + ")");
		}
	}
}
