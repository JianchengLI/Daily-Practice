package perso.daily.jse.generic;

public class GenericMethodsAndBoundedTypeParameters {

	 /*
	public static <T> int countGreaterThan(T[] anArray, T elem) {
	    int count = 0;
	    for (T e : anArray)
	    	// You cannot use the > operator to compare objects
	        if (e > elem)  // compiler error
	            ++count;
	    return count;
	}*/
	
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
	    int count = 0;
	    for (T e : anArray)
	        if (e.compareTo(elem) > 0){
	        	System.out.println(e);
	            ++count;
	        }
	    
	    return count;
	}
		
	public static void main(String[] args) {
		Integer[] anArray = {1, 2, 3, 4, 5};
		System.out.println("Total : " + countGreaterThan(anArray, 3));
		
		String[] anArray2 = {"1","2","3","4","5"};
		System.out.println("Total : " + countGreaterThan(anArray2, "3"));
	}
	
}
