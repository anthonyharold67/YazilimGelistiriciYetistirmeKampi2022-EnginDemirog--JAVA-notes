package lesson17;

public class Main {

	public static void main(String[] args) {
		// strings
		String mesaj = "bugün hava çok güzel";
		
		System.out.println(mesaj);
		System.out.println("++++++++++++++++");
		//karakter sayısı bulma
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("++++++++++++++++");
		//indexteki elemanı bulma
		System.out.println("5.eleman : " + mesaj.charAt(4));
		System.out.println("++++++++++++++++");
		//concat etme
		System.out.println(mesaj.concat("yaşasın"));//stringi değiştirmez
		System.out.println("++++++++++++++++");
		//startswith / endswith
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("l"));
		System.out.println("++++++++++++++++");
		//karakterleri alma
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println("++++++++++++++++");
		
		//indexOf-index numarasını bulma
		System.out.println(mesaj.indexOf("a"));//ilk bulduğunu verir
		System.out.println(mesaj.indexOf("Z"));// olmayanı -1 olarak döndürür
		
		//lastIndexOf
		System.out.println(mesaj.lastIndexOf("a"));//ilk bulduğunu verir ama sağdan başlar aramaya

	}

}
