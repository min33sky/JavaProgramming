package practice;

import java.text.DecimalFormat;

public class DecimalFormatTest {
	public static void main(String[] args) {
		DecimalFormat zeroDF = new DecimalFormat("000,000");
		String result = zeroDF.format(1234);
		System.out.println(result);
		
		DecimalFormat sharpDF = new DecimalFormat("###,###");
		String result2 = sharpDF.format(1234);
		System.out.println(result2);
	}
}
