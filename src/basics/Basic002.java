package basics;

public class Basic002 {
	public static void main(String[] args) {
	//	String name = "";
		
		for(int i = 0; i<26; i++) {
			char ch = (char) ('A' + i);
			System.out.print(ch + " ");
		}
		System.out.println();
//Printed the ABCD to Z
		
		StringBuilder sb = new StringBuilder();
		sb.append("Ripunjay");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
	}	

}
