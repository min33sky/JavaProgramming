package util;

public class StringEx {
	public static void main(String[] args) {
		String str = new String("Drogba's House");
		
		String temp1 = str.substring(7);
		String temp2 = str.substring(3, 10);
		
		System.out.println(temp1);
		System.out.println(temp2);
		
		System.out.println("House가 있는가? " + str.contains("House"));
		
		System.out.println("문자단위로 변경 : " + str.replace('H', '1'));
		System.out.println("문자열단위로 변경 : " + str.replace("Drogba", "Torres"));
	}
}
