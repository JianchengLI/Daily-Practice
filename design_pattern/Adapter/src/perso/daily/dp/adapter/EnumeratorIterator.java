package perso.daily.dp.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumeratorIterator<E> implements Iterator<E> {
	private Enumeration<E> enumeration;
	
	public EnumeratorIterator(Enumeration<E> enumeration) {
		super();
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public E next() {
		return enumeration.nextElement();
	}
	
	@Override
	public void remove(){
		new UnsupportedOperationException("remove");
	}
}
