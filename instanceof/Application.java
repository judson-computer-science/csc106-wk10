import java.util.ArrayList;

public class Application {

        public static void main(String[] args) {

                // notice what type of objects are in the ArrayList
                ArrayList<Measurable> shapes = new ArrayList<>();

                shapes.add(new Box(2,3,4));
                shapes.add(new Square(5,6));

		for(Measurable shape : shapes) {
                        System.out.println("Edge Length: " + shape.getTotalEdgeLength());
                        System.out.println("Surface Area: " + shape.getTotalSurfaceArea());

			if(shape instanceof Fillable) {
				Fillable fillableShape = (Fillable) shape;
				System.out.println("Available volume is: " + fillableShape.getRemainingVolume());
				fillableShape.fill(6);
				System.out.println("Available volume is: " + fillableShape.getRemainingVolume());
			}
                }
	}
}
