package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex {
	public static void main(String[] args) {
		String path = Ex.class.getResource("siba.txt").getPath();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String str = br.readLine();
			while(str != null){
				StringTokenizer st = new StringTokenizer(str);
				System.out.println(st.nextToken() + " : " + st.nextToken());
				str = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
