package perso.daily.jse.generic;

import java.util.ArrayList;
import java.util.List;
public class TypeInferenceBoxDemo {

	public static <U> void addBox(U u, List<Box<U>> boxes) {
		Box<U> box = new Box<>();
		box.set(u);
		boxes.add(box);
	}

	public static <U> void outputBoxes(List<Box<U>> boxes) {
		int counter = 0;
		for (Box<U> box : boxes) {
			U boxContents = box.get();
			System.out.println("Box #" + counter + " contains [" + boxContents.toString() + "]");
			counter++;
		}
	}

	public static void main(String[] args) {
		ArrayList<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();

		// TypeInferenceBoxDemo.<Integer>addBox .. is not required ( Type Inference )
		TypeInferenceBoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);

		TypeInferenceBoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
		TypeInferenceBoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
		TypeInferenceBoxDemo.outputBoxes(listOfIntegerBoxes);
	}
}
