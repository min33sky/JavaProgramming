package practice.string;

import java.math.BigDecimal;

public class PrintReceipt1 {
	public static void main(String[] args) {
		// 구매 내역 데이터 작성
		Detail detail = new Detail();
		detail.setItemName("쌀5kg");
		detail.setAmount(new BigDecimal(15000));
		
		// 구매 내역 데이터 가공
		StringBuilder sb = new StringBuilder();
		sb.append(detail.getItemName());
		sb.append("     ");
		sb.append(detail.getAmount());
		sb.append("원");
		
		// 구매 내역 출력
		System.out.println(sb.toString());
		
	}
}
