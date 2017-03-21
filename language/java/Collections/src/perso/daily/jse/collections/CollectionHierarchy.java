package perso.daily.jse.collections;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArraySet;

public class CollectionHierarchy {
	
	@SuppressWarnings("unused")
	private enum Color {
		RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
		private int r;
		private int g;
		private int b;

		private Color(int r, int g, int b) {
			this.r = r;
			this.g = g;
			this.b = b;
		}
		public int getR() {return r;}
		public int getG() {return g;}
		public int getB() {return b;}
	}

	/**
	 * Try all Collection Hierarchy Interface HL : Hierarchy Level
	 */
	public static void main(String[] args) {
		trySet();
		tryList();
		trySortedSet();
	}

	@SuppressWarnings("unused")
	public static void trySet() {
		
		LinkedHashSet<String> linkhashSet = new LinkedHashSet<>();
		HashSet<String> linkhashSetHL1 = new LinkedHashSet<>();
		Set<String> hashSetHL2 = new LinkedHashSet<>();
		Collection<String> hashSetHL3 = new LinkedHashSet<>();

		CopyOnWriteArraySet<String> copyWriteArraySet = new CopyOnWriteArraySet<>();
		Set<String> copyWriteArraySetHL1 = new CopyOnWriteArraySet<>();
		Collection<String> copyWriteArraySetHL2 = new CopyOnWriteArraySet<>();
		
		EnumSet<Color> enumSet = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
		Set<Color> enumSetHL1 = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
		Collection<Color> enumSetHL2 = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);

	}

	@SuppressWarnings("unused")
	public static void trySortedSet(){
		/* 
		 * Sets implements the interface
		 * SortedSet<E> , NavigableSet<E>
		 */
		TreeSet<String> treeSet= new TreeSet<>();
		Set<String> treeSetHL1= new TreeSet<>();
		Collection<String> treeSetHL2 = new TreeSet<>();
	}
	
	@SuppressWarnings("unused")
	public static void tryList() {
		List<String> arrayListHL1 = new ArrayList<>();
		Collection<String> arrayListHL2 = new ArrayList<>();

		AbstractSequentialList<String> linkListHL1 = new LinkedList<>();
		List<String> linkListHL2 = new LinkedList<>();
		Collection<String> linkListHL3 = new LinkedList<>();

		Vector<String> stackHL1 = new Stack<>();
		List<String> stackHL2 = new Stack<>();
		Collection<String> stackHL3 = new Stack<>();
	}
}
