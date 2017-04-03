package perso.daily.dp.iterator;

import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		ConcreteAggregate concreteAggregate = new ConcreteAggregate(4);
		concreteAggregate.add(new Concrete("item1"));
		concreteAggregate.add(new Concrete("item2"));
		concreteAggregate.add(new Concrete("item3"));
		concreteAggregate.add(new Concrete("item4"));
		concreteAggregate.add(new Concrete("item5"));
		
		Iterator<Concrete> iterator = concreteAggregate.createIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
