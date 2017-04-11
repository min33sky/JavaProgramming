package practice;

public class Nqueen {
	
	static int number = 4;
	static int[] cols = new int[number+2];

	public static void main(String[] args) {
		queens(0);
	}

	private static boolean queens(int level) {
		if(!promising(level)){
			return false;
		}else if(level == number){
			for(int i=1; i<=number; i++){
				System.out.println("(" + i + ", " + cols[i] + ")");
			}
			return true;
		}
		for(int i=1; i<=number; i++){
			cols[level+i] = i;
			if(queens(level+1))
				return true;
		}
		return false;
	}

	private static boolean promising(int level) {
		for(int i=1; i<level; i++){
			if(cols[i] == cols[level]){
				return false;
			}else if(level-i == Math.abs(cols[level]-cols[i])){
				return false;
			}
		}
		return true;
	}
}
