package ex18.file.copy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileInputExample {
	public static void main(String[] args) throws IOException {
//		Reader in = new FileReader("c:/java/primitive.txt");
		Reader in = new FileReader("c:/java/primitive2.txt");
		BufferedReader br = new BufferedReader(in);
		int count = Integer.parseInt(br.readLine());	// 첫 번째 줄에서 줄 개수 파악
		System.out.println("개수 : " + count);
//		for(int i=0; i<count; i++){
//			String[] str = br.readLine().split(" ");	// 공백을 기준으로 나눈다.
//			System.out.println(str[0] + " : " + str[1]);
//		}
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<count; i++){
			String[] str = br.readLine().split(" ");	// 공백을 기준으로 나눈다.
			list.add(Integer.parseInt(str[0]));
			list.add(Integer.parseInt(str[1]));
		}

		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		br.close();
		in.close();
		System.out.println("끝");
	}
}
