package javaBible_ex;

public class Ex4_5 {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		int count = 1;
		int i = 1;
		while(count <= 10){
			i = 1;
			while(i <= count){
				System.out.print("*");
				i++;
			}
			System.out.println();
			count++;
		}
	}
}
