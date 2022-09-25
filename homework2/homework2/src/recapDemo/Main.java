package recapDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DortIslem dörtIslem = new DortIslem();
		int toplam = dörtIslem.Topla(5, 9);
		int carpim = dörtIslem.Carp(8, 9);
		int cikar = dörtIslem.Cikar(87, 39);
		int böl = dörtIslem.Böl(150, 10);
		int bölSifir = dörtIslem.Böl(150, 0);
		
		System.out.println(toplam);
		System.out.println(carpim);
		System.out.println(cikar);
		System.out.println(böl);
		System.out.println(bölSifir);
	}

}
