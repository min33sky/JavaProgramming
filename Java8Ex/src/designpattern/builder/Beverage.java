package designpattern.builder;

/*
 * 빌더 패턴
 */
public class Beverage {

	private String name;
	private int size;
	private int calories;
	private int protein;
	private int fat;
	private int sodium;
	private int calcium;

	public Beverage(Builder builder) {
		this.name = builder.name;
		this.size = builder.size;
		this.calories = builder.calories;
		this.protein = builder.protein;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.calcium = builder.calcium;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getSodium() {
		return sodium;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public int getCalcium() {
		return calcium;
	}

	public void setCalcium(int calcium) {
		this.calcium = calcium;
	}

	/*				 Builder			*/
	public static class Builder{
		private String name;
		private int size;
		private int calories;
		private int protein;
		private int fat;
		private int sodium;
		private int calcium;

		public Builder(String name, int size){
			this.name = name;
			this.size = size;
		}

		public Builder calories(int calories){
			this.calories = calories;
			return this;
		}

		public Builder protein(int protein) {
			this.protein = protein;
			return this;
		}

		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}

		public Builder sodium(int sodium) {
			this.sodium = sodium;
			return this;
		}

		public Builder calcium(int calcium) {
			this.calcium = calcium;
			return this;
		}

		public Beverage build(){
			return new Beverage(this);
		}
	}
}
