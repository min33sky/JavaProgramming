package ex2;

import java.util.List;

public class Customer {
	/*
	 * 객체를 변경 불가능하게 만들어라.
	 * 필드는 final로 선언하라
	 * 필드에 대한 getter 메서드는 필요한 경우에만 제공하라
	 * final로 선언된 객체들의 상태가 변화할 수도 있다는 것을 유의하라
	 * 변경이 가능한 컬렉션은 신중하게 사용하라
	 */
	
	private final List<Order> orders;
	public List<Order> getOrders(){ return this.orders;}
	public Customer(List<Order> orders) {
		this.orders = orders;
	}
	
	
}
