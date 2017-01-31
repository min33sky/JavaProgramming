package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Park Keun Hye");
		list.add("Woo Byung Woo");
		list.add("Choi Sun Sil");
		
		String[] arr = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr));
		
		String[] array = {"A", "B", "C", "D"};
		List<String> list2 = Arrays.asList(array);
		System.out.println(list2);
		
	}
}
