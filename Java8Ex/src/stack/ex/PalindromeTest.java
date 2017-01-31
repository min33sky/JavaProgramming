package stack.ex;

public class PalindromeTest {
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome("abcXcba"));
		System.out.println(p.isPalindrome("abcXabc"));
	}
}
