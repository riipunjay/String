package basics;

public class Basic004 {

	// palindrom using StringBuilder

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdcbaq");
		StringBuilder rev = new StringBuilder(sb.reverse());
		if (rev.equals(sb)) {
			System.out.println("Character is Palindrome");
		} else
			System.out.println("Character is not Palindrome");

	}
}
