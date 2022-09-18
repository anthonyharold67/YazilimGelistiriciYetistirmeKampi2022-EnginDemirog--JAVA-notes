package example;

public class Main {

	public static void main(String[] args) {
		// toplama islemi
		int[] numbers = {1,25,41,78};
		Topla topla = new Topla();
		topla.topla(numbers);
		
		// metnin uzunluğunu bulma
		Uzunluk uzunluk = new Uzunluk();
		uzunluk.uzunluk("ben bir fenerbahçeliyim");
		
		// metni tersten yazdırma
		Reverse reverse = new Reverse();
		reverse.reverse("araba");
		
	}

}
