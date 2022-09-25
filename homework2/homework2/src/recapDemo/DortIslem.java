package recapDemo;

public class DortIslem {
	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public int Cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
	
	public int Carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	public int Böl(int sayi1, int sayi2) {
		if (sayi1 == 0 | sayi2==0) {
			return 0;
		}
		return sayi1 / sayi2;
	}
}
