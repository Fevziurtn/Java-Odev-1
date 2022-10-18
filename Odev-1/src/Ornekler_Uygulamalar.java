
public class Ornekler_Uygulamalar {

	public static void main(String[] args) {
		// Asal Sayı Bulma
		int number = 6;
		int remainder = number % 2;
		// System.out.println(remainder);
		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı asaldır");
		} else {
			System.out.println("Sayı asal değildir.");
		}

		// İnce ve Kalın Sesli Harfler

		char harf = 'A';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("\"" + harf + "\"" + " Kalın sesli harftir.");
			break;

		default:
			System.out.println("\"" + harf + "\"" + " İnce sesli harftir.");
			break;
		}

		// Mükemmel Sayı Bulmak
		// 6 ---> 1,2,3 e bölünür ve 1+2+3 = 6

		int num = 5;
		int total = 0;

		for (int k = 1; k < num; k++) {
			if (num % k == 0) {
				total = total + k;
			}
		}
		if (total == num) {
			System.out.println("Mükemmel sayıdır.");
		} else {
			System.out.println("Mükemmel sayı değildir.");
		}

		// ~~ ~~ ~~ 23. ve 24. videoları izle ~~ ~~ ~~

	}

}
