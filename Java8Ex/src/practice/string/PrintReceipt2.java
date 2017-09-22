package practice.string;

import java.math.BigDecimal;

public class PrintReceipt2 {
	public static void main(String[] args) {
		// 구매 내역 데이터 작성
		Detail detail1 = new Detail();
		detail1.setItemName("쌀5kg");
		detail1.setAmount(new BigDecimal(15000));
		Detail detail2 = new Detail();
		detail2.setItemName("감9개");
		detail2.setAmount(new BigDecimal(9000));
		
		// 구매 내역 문자열 서식 정의
		String lineBase = "%-10s%,10d원";	// 문자열 왼쪽정렬 10자리 + 남는자리 공백, 10자리 수치(3자리마다 컴마)
		
		// 문자열 데이터 가공
		String result1 = String.format(lineBase, detail1.getItemName(), detail1.getAmount().longValue());
		String result2 = String.format(lineBase, detail2.getItemName(), detail2.getAmount().longValue());
		
		// 구매 내역 출력
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
