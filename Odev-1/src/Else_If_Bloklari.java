
public class Else_If_Bloklari {

	public static void main(String[] args) {
		//3.Konu = if blokları ile çalışmak
				int deger1 = 20;
				if (deger1>20) {
					System.out.println("Sayı 20'den büyüktür.");
				}
				else if (deger1<20) {
					System.out.println("Sayı 20'den küçüktür.");
				}
				else {
					System.out.println("Sayı 20'ye eşittir.");
				}
				
				//4.Konu = En Büyük Sayıyı Bulma
				int sayi1 = 20; 
				int sayi2 = 25; 
				int sayi3 = 2; 
				int enBuyuk = sayi1;
				
				if (enBuyuk<sayi2) {
					enBuyuk = sayi2;
				}
				if (enBuyuk<sayi3) {
					enBuyuk = sayi3;
				}
				System.out.println("En Büyük Sayı: " + enBuyuk);

	}

}
