package stringhe;

public class ProvaStringhe {

	public static void main(String[] args) {

		char[] caratteri = {'h', 'e', 'l', 'l', 'o'};
		
		String s = new String(caratteri);
		
		System.out.println("La stringa s  è lunga " + s.length());
		System.out.println("La stringa s  è inizia con" + s.charAt(0));
		System.out.println("La stringa s in maiuscolo " + s.toUpperCase());
		System.out.println("La stringa s  modificata " + s.replace('l', 's'));
		System.out.println("La stringa s  ripetuta 3vv" + s.repeat(3));
		

	}

}
