import java.util.ArrayList;

public class Square implements Measurable {

        private int l, w;

        public Square(int l, int w) {
                this.l = l;
                this.w = w;
        }

	public int getTotalEdgeLength() {
		return 2 * (l + w);
	}

	public int getTotalSurfaceArea() {
		return l * w;
	}
}
