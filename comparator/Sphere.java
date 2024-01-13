public class Sphere implements Fillable {

	private static int nextNumber = 1;
	private int number;
	private int r;
	private int currentVolume, maxVolume = 0;

	public Sphere(int r) {
		number = nextNumber++;
		this.r = r;
		maxVolume = 3 * r * r * r;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public void fill(int units) {
		currentVolume += units;
	}

	public int getNumber() {
		return number;
	}
}

