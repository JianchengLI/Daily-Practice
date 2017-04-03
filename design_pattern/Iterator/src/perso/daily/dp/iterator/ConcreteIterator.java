package perso.daily.dp.iterator;

import java.util.Iterator;

public class ConcreteIterator implements Iterator<Concrete> {
	private Concrete[] _items;
	private int _position = 0;
	
	public ConcreteIterator(Concrete[] items){
		_items = items;
	}
	@Override
	public boolean hasNext() {
		return (_position >= _items.length || _items[_position] == null) ? false : true;
	}

	@Override
	public Concrete next() {
		Concrete concrete = _items[_position];
		_position = _position + 1;
		return concrete;
	}

}
