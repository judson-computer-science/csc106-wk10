public class Box implements Measurable, Fillable {

	private int l, w, h;
	private int totalVolume, currentVolume = 0;

	public Box(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
		this.totalVolume = l * w * h;
	}

	public int getTotalEdgeLength() {
		return 4 * (l + w + h);
	}

	public int getTotalSurfaceArea() {
		return 2 * ((l * w) + (l * h) + (w * h));
	}

	public void fill(int units) {
		currentVolume += units;
	}

	public int getRemainingVolume() {
		return totalVolume - currentVolume;
	}
}
