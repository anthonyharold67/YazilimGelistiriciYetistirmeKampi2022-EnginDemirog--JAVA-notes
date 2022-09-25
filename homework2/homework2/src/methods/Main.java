package methods;

public class Main {

	public static void main(String[] args) {
        //fonksiyon kullanarak aynı kodu tekrar yyazamk yerine bir function oluşturup onu lazım olan yerde çağırıyroruz
		sayiBulmaca(5);
		sayiBulmaca(6);
	}
	
	public static void sayiBulmaca(int aranacak) {
		int[] sayilar = new int[]{1,2,5,7,9,0};

		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayı bulundu: " + aranacak);
			mesajVer("Sayı bulundu: " + aranacak);//mesajVer adından bir fonksiyon oluşturup mesajı da dinamik bir hale getirmiş olduk
		}else {
			System.out.println("Sayı bulunmadı : " + aranacak);
		}

	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
