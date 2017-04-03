package perso.daily.dp.iterator;

import java.util.Iterator;

public class ConcreteAggregate implements Aggregate {
	private int _size;
	private int _cursor = 0;
	private Concrete[] _items;
	
	
	public ConcreteAggregate(int size) {
		_size = size;
		_items = new Concrete[_size];
	}

	@Override
	public Iterator<Concrete> createIterator() {
		return new ConcreteIterator(_items);
	}
	
	public int add(Concrete concrete){
	     if(_cursor >= _size )
	    	 return _size;
	     
		_items[_cursor] = concrete;
		_cursor ++;
		return _cursor;
	}

}
