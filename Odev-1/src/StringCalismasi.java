
public class StringCalismasi {

	public static void main(String[] args) {
		// String Çalışmaları 1
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Elelman sayısı: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));

	}

}
