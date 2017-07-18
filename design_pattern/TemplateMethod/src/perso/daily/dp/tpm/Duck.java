package perso.daily.dp.tpm;

import java.util.Arrays;

public class Duck implements Comparable<Object> {

	private String Name;
	private int weight;
	
	public Duck(String name, int weight) {
		super();
		Name = name;
		this.weight = weight;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString(){
		return Name + " weight " + weight;
	}
	@Override
	public int compareTo(Object o) {
		Duck otherDuck = (Duck)o;
		if(otherDuck.getWeight() > this.weight){
			return -1;
		}
		else if (otherDuck.getWeight() == this.weight) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args){
		Duck[] ducks = {
				new Duck("Daffy", 8),
				new Duck("Dewey", 2),
				new Duck("Howare", 7),
				new Duck("Louie", 2),
				new Duck("Donald", 10),
				new Duck("Huey", 2)
		};
		
		display(ducks);
		
		Arrays.sort(ducks);
		
		display(ducks);
		
	} 
	
	public static void display(Duck[] ducks){
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}

}
