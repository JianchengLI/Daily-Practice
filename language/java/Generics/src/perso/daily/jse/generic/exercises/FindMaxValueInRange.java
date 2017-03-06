package perso.daily.jse.generic.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class AClassComparable implements Comparable<AClassComparable> {

	private int value;
	
	public int getValue() {return value;}
	public void setValue(int value) {this.value = value;}
	public AClassComparable(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {return "Value: "+ String.valueOf(value);}

	@Override
	public int compareTo(AClassComparable o) {
		if (this.value == o.getValue())
			return 0;
		return this.value > o.getValue() ?  1 : -1;
	}
	
}
public class FindMaxValueInRange {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		findMaxValueInRange(list, 3, 8); // expect : 7
		findMaxValueInRange(list, 8, 9); // expect : ....
		
		List<AClassComparable> listObjects = Arrays.asList(
				new AClassComparable(1),
				new AClassComparable(2),
				new AClassComparable(3),
				new AClassComparable(4),
				new AClassComparable(5),
				new AClassComparable(6),
				new AClassComparable(7),
				new AClassComparable(8),
				new AClassComparable(9)
		);
		findMaxValueInRange(
				listObjects, 
				new AClassComparable(3),
				new AClassComparable(8)); // expect : value : 7
	}
	
	public static <T extends Comparable<T>  > void findMaxValueInRange(List<T> list, T min, T max) {
		Optional<T> rangMaxValue = Optional.ofNullable(null);
		Comparator<T> compare = (x, y) -> x.compareTo(y);
		rangMaxValue =
				list.stream()
						.filter(e -> e.compareTo(min) > 0 && e.compareTo(max) < 0)
						.distinct()
						.max(compare);
		
		rangMaxValue.ifPresent(e->{System.out.println(e);});
	}
}
