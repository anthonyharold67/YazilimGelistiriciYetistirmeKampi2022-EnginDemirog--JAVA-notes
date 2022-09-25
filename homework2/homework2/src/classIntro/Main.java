package classIntro;

public class Main {

	public static void main(String[] args) {
		// classlar reference type
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Edit();
		customerManager.Remove();

		// değer tipleri.herşey stack te döner
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;// sayi1 şuan 10 olduğu için 10 değerini atamış olduk
		sayi1 = 30;
		System.out.println(sayi2);// 10 değerini yazdırır

		// diziler referans tiplidir

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar1 = sayilar2;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);// 10 çıktısını verdi.çünkü referans tipli olduğu için arttık heapte tutuyor
										// veriyi stackte referansını tutuyor biz eşitleme yaptığımızda referanslarını
										// eşitliyor

		
	}

}
