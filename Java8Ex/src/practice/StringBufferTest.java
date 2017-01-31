package practice;

import java.text.DecimalFormat;

public class StringBufferTest {
	public static void main(String[] args) {
		/*
		 * StringBuffer : Synchronized(O)
		 * StringBuilder : Synchronized(X) , Faster than StringBuffer
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append("World");
		
		String str = sb.toString();
		System.out.println(str);
		
		
	}
}
