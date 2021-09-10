import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruit implements Comparable<Fruit>{
	private int no;
	private String name;
	private int price;

	

	public Fruit(int i, String string, int j) {
		no = i;
		name = string;
		price = j;
	}
	
	@Override
	public int compareTo(Fruit o) {
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String args[]) {
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1);
		Fruit s2 = new Fruit(101, "Orange", 1500);
		fl.add(s2);
		Fruit s3 = new Fruit(101, "Dragonfruit", 2000);
		fl.add(s3);
		Fruit s4 = new Fruit(101, "Kiwi", 2500);
		fl.add(s4);
		Fruit s5 = new Fruit(101, "Pineapple", 3000);
		fl.add(s5);
		Fruit s6 = new Fruit(101, "Plum", 3500);
		fl.add(s6);
		Fruit s7 = new Fruit(101, "Apricot", 4000);
		fl.add(s7);
		Fruit s8 = new Fruit(101, "Pomegranate", 4500);
		fl.add(s8);
		Fruit s9 = new Fruit(101, "Persimmon", 5000);
		fl.add(s9);
		Fruit s10 = new Fruit(101, "Watermelon", 5500);
		fl.add(s10);
		
		Collections.sort(fl);
		
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
	}

	

}




	

