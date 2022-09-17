package lesson18;

public class Main {

	public static void main(String[] args) {
		// strings 2.stribgler immutabledır

		String mesaj = "bugün hava çok güzel";
		//replace
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println("++++++++++++++++");
		//substring
		System.out.println(mesaj.substring(2));//2 nci indexten sonun akdar kes
		System.out.println(mesaj.substring(2,5));// 2den başla 5 i dahil etme
		System.out.println("++++++++++++++++");
		//split
		for (String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println("++++++++++++++++");
		
		//lowerCase / upperCase
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println("++++++++++++++++");
		
		String mesaj1 = "   bugün hava çok güzel   ";
		System.out.println(mesaj1.trim());
		System.out.println("++++++++++++++++");
		System.out.println(mesaj.split(" "));//bellekteki yerini veriyor çıktı istiyorsak for ile dönmemiz lazım yada index ile tek tek
		
		String[] mesajArr = mesaj.split(" ");
		System.out.println(mesajArr);//bellekteki yerini veriyor çıktı istiyorsak for ile dönmemiz lazım yada index ile
		
		String[] karak = {"a","b","c"};
		System.out.println(karak[0]);
		
	}

}
