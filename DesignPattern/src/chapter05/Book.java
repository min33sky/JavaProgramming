package chapter05;

public class Book {
	// 책은 서명, 출판년도, 가격을 갖음
	private String name;		// 서명
	private int publishYear;	// 출판년도
	private int price;			// 가격
	
	public Book(String name, int publishYear, int price) {
		this.name = name;
		this.publishYear = publishYear;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public int getPrice() {
		return price;
	}
	
}
