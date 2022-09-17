package lesson9;

public class Main {

	public static void main(String[] args) {
		// recap demo 1 En büyük sayı hangisi
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
		
		System.out.println("En büyük sayı : " + enBuyuk);
	}

}
