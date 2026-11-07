package basics;

public class Basic001 {
	public static void main(String[] args) {
//		String a = "Ripunjay";
//		System.out.println(a);
//		a = "Kumar";
//		System.out.println(a);
		
		//Compare == vs .compares
		String name = "Ripunjay";
		String naam = "Ripunjay";
		
		System.out.println(name == naam);
		
		String name1 = new String ("Ripunjay");
		String name2 = new String ("Ripunjay");
		
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
	}
}
