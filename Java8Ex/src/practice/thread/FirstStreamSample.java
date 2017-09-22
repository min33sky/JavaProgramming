package practice.thread;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirstStreamSample {
	public static void main(String[] args) {
		// 상품 데이터 리스트를 만든다.
		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item("무", 100));
		itemList.add(new Item("두부", 40));
		itemList.add(new Item("달걀", 210));
		
		// 리스트를 Stream화
		itemList.parallelStream()
		// 금액의 순서대로 정렬
		.sorted(Comparator.comparingInt(item -> item.getPrice()))
		// 정렬한 결과를 출력
		.forEachOrdered(item -> System.out.println(item));
	}
}
