package lesson22;

public class Main {

	public static void main(String[] args) {
		//arkadaş sayılar 220 ve 284 220 nin bölenlerinin toplamı 284e eşit 284 ün bölenlerinin toplamı 220ye eşit
		
		int sayi1 = 220;
		int sayi2 = 284;
		
		int toplam1 = 0;
		int toplam2 = 0;
		
		for (int i =1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 += i;
			}
		}
		for (int i =1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 += i;
			}
		}
		
		if(sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Bu sayılar arkadaş sayılardır : " + sayi1 + "-" + sayi2);
		}else {
			System.out.println("Bu sayılar arkadaş sayılar değildir : " + sayi1 + "-" + sayi2);
		}
	}

}
