package practice;

public class Record {
	private String name;
	private int id;
	private double value;
	
	/**
	 * 모든 변수들을 사용하여 hashCode를 생성하자
	 * Hash Code : -2^31 ~ 2^31 사이의 정수 (32비트)
	 * Hash 함수 : 0 ~ M-1 까지의 정수 (배열 인덱스)
	 */
	public int hashCode(){
		int hash = 17;	// nonzero constant
		hash = 31*hash + name.hashCode();
		hash = 31*hash + Integer.valueOf(id).hashCode();
		hash = 31*hash + Double.valueOf(value).hashCode();
		return hash;
	}
}
