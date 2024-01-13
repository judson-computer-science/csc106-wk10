import java.util.Comparator;

public class MaxVolumeComparator implements Comparator {

	// < 1 if o1 is smaller
 	// > 1 if o2 is smaller
	// 0 if they are equal
	public int compare(Object o1, Object o2) {

		Fillable f1 = (Fillable) o1;
		Fillable f2 = (Fillable) o2;

		return f1.getMaxVolume() - f2.getMaxVolume();
	}
}

