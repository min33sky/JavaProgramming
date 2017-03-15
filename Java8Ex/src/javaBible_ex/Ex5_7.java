package javaBible_ex;

import javax.swing.JOptionPane;

public class Ex5_7 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("돈을 입력하세요...");
		int money = Integer.parseInt(input);
		System.out.println("money = " + money);
		
		int[] coinUnit = {500, 100, 50, 10};	// 동전의 단위
		int[] coin = {5, 5, 5, 5};				// 단위 별 동전의 개수
		
		for(int i=0; i<coinUnit.length; i++){
			int coinNum = 0;
			
			coinNum = money / coinUnit[i];
			
			if(coin[i] < coinNum){
				coinNum = coin[i];			
				coin[i] = 0;				
			}else{
				coin[i] = coin[i] - coinNum;
			}
			
			money = money - (coinUnit[i] * coinNum);
			
			System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		
		if(money > 0){
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		
		System.out.println("= 남은 동전의 개수 =");
		
		for(int i=0; i<coinUnit.length; i++){
			System.out.println(coinUnit[i] + "원: " + coin[i]);
		}
	}
}
