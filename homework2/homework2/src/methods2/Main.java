package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = mesaj.substring(0, 2);// değer döndüren metotlar
		String sehir = sehirVer();
		int toplam = topla(6, 7);
		System.out.println(yeniMesaj);
		System.out.println(sehir);
		System.out.println(toplam);
		//variable arguments
		int toplam2 = topla2(1,35,624,8);//668
		System.out.println(toplam2);

	}

	public static void ekle() {
		System.out.println("Void operasyonlar bir değer döndürmez bir iş yaptırmak için kullanılır");
		// return "a"; bu bir void diyor ve hata veriyor
	}

	public static void sil() {
		System.out.println("Void operasyonlar bir değer döndürmez bir iş yaptırmak için kullanılır");
		// return "a"; bu bir void diyor ve hata veriyor
	}

	public static void güncelle() {
		System.out.println("Void operasyonlar bir değer döndürmez bir iş yaptırmak için kullanılır");
		// return "a"; bu bir void diyor ve hata veriyor
	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

}
