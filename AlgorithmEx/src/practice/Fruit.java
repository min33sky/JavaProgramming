package practice;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{
	public String name;
	public int quantity;
	public Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	/**
	 * 객체별로 하나씩 갖고있을 필요가 없으므로 static 선언 
	 */
	public static Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o1.name.compareTo(o2.name);
		}
	};
	
	public static Comparator<Fruit> quantityComparator = new Comparator<Fruit>() {
		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o1.quantity - o2.quantity;
		}
	};
	
	
	@Override
	public int compareTo(Fruit o) {
		return this.quantity - o.quantity;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", quantity=" + quantity + "]";
	}
	
}
