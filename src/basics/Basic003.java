package basics;

import java.util.Arrays;

public class Basic003 {
	public static void main(String[] args) {
			
		String name = "Ripunjay";
		char a[] = name.toCharArray(); //Convert the String into Arrays
		System.out.println(Arrays.toString(a));
		
		System.out.println(name.length());//Gives you length of the String
		System.out.println(name.toUpperCase());//Changes every letter to uppercase
		System.out.println(name.toLowerCase());//Changes every letter to lower case
		System.out.println(name.indexOf(4));//Prints what is available at index 4
	}
}
