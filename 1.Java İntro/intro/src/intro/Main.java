package intro;

public class Main {
	// main javada başlangıç metodudur.
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello Anthony!");
		
		//değişken isimlendirmeleri javada camelCase yazılır. String veri tipleri büyük harfle başlar
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		//integer=>tam sayılar için
		int vade = 12;
		//ondalıklı sayılar için:
		double dolarDun = 18.10;
		double dolarBugün= 18.15;
		// koşullu ifadeler için
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugün<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugün>dolarDun){
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		String[] krediler = {"Hızlı Kredi", "Maaşını Halbaktan", "Mutlu emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
				
	}

}
