package ex18.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/ex18/resource/test3.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("src/ex18/resource/test4.txt"));
		String temp = "";
		
		while((temp = br.readLine()) != null){
			String[] arr = temp.split(" ");
			print(arr[0], arr[1]);
		}
		System.out.println("***************************");
		
		int count = Integer.parseInt(br2.readLine());
		int index = 0;
		int[] arr = new int[count*2];
		for(int i=0; i<count; i++){
			String[] ta = br2.readLine().split(" ");
			arr[index++] = Integer.parseInt(ta[0]);
			arr[index++] = Integer.parseInt(ta[1]);
		}

		System.out.println(Arrays.toString(arr));
		
		br.close();
		br2.close();
	}
	
	private static void print(String a, String b) {
		System.out.println(a + " : " + b);
	}
}
