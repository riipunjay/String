package basics;

public class Basic001 {
	public static void main(String[] args) {
//		String a = "Ripunjay";
//		System.out.println(a);
//		a = "Kumar";
//		System.out.println(a);
		
		float a = 284.2947f;
		System.out.printf("Number is : %.2f", a);
		//Compare == vs .compares
		System.out.println();
		String name = "Ripunjay";
		String naam = "Ripunjay";
		System.out.println(name.charAt(5));
		
		System.out.println(name == naam);
		
		String name1 = new String ("Ripunjay");
		String name2 = new String ("Ripunjay");
		
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
	}
}
