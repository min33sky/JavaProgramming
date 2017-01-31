package datastructure.stack;

public class Test {
	public static void main(String[] args) {
		SymbolBalance sb = new SymbolBalance();
		System.out.println(sb.isValidSymbolPattern("{(a+b)+(a-b)}"));
	}
}
