package practice.string;

public class StringBuilderEx {
	public static void main(String[] args) {
	
		String text1 = "정말 ";
		String text2 = "사랑합니다.";
		StringBuilder sb = new StringBuilder();
		sb.append(text1);
		sb.append(text2);
		System.out.println(sb.toString());
	
	}
}
