package lesson14;

public class Main {

	public static void main(String[] args) {
		// array
		//arrayleri yazdırmak için döngü ile dönmemiz gerekiyor
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		// bu şekilde işimiz zorlaşıyor 4 öğrenci ile bile iş zorlaşıyor belki yüzlerce öğrenci var
		System.out.println("------------------------------------");
		
		String[] ogrenciler = new String[4];//array tanımladık ve eleman sayısını belirledik.yeni eleman eklediimizde sayıyı artırmamız lazım
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("------------------------------------");
		// 2. yöntem
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		

	}

}
