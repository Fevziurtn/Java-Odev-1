
public class Diziler {

	public static void main(String[] args) {
		// Diziler
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		// 17. soruyu çöz

		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bilecik";
		sehirler[0][2] = "Bursa";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";

		for (int s = 0; s <= 2; s++) {
			System.out.println("--------------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[s][j]);
			}
		}

	}

}
