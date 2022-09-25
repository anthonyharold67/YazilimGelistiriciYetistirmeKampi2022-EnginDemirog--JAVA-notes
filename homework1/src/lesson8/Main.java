package lesson8;

public class Main {

	public static void main(String[] args) {
		// if-else if-else
		
		int sayi = 20;
		
		if (sayi < 21 ) {
			System.out.println("Sayi 21 den küçüktür");
		}
		
		if (sayi < 15) {
			System.out.println("Sayi 20 den küçüktür.");//sayi 15ten küçük olmadığı için burası çalışamyacak
		} else {
			System.out.println("Sayi 15den büyüktür"); //if e girmediği için else e girdi
		}
		
		if (sayi < 20 ) {
			System.out.println("Sayi 21 den küçüktür");
		} else if (sayi == 20) {
			System.out.println("Sayi 20 ye eşittir");
		} else {
			System.out.println("Sayi 21 den büyüktür");
		}

	}

}
