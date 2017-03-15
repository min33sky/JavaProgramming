package javaBible_ex;

public class Ex4_12 {
	public static void main(String[] args) {
		for(int i=2; i<10; i=i+3){
			for(int j=1; j<=3; j++){
				if(i+2 >= 10){
					System.out.println(i+"*"+j+"="+(i*j) + "\t" + (i+1)+"*"+j+"="+((i+1)*j));
				}else{
					System.out.println(i+"*"+j+"="+(i*j) + "\t" + (i+1)+"*"+j+"="+((i+1)*j) + "\t" + (i+2)+"*"+j+"="+((i+2)*j) );
				}
			}
			System.out.println();
		}
	}
}
