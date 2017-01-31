package practice;

public class ArrayParameter {
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','e','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

	private static void printCharArray(char[] c) {
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]);
		}
	}

	private static void replaceSpace(char[] c) {
		for(int i=0; i<c.length; i++){
			if(c[i] == ' '){
				c[i] = ',';
			}
		}
		System.out.println();
	}
	
}
