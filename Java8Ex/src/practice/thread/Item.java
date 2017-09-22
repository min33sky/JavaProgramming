package practice.thread;

public class Item {
	// 상품명
	private String itemName;
	// 금액
	private int price;
	
	public Item(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("itemName=[%s] price=[%d]", this.itemName, this.price);
	}
}
