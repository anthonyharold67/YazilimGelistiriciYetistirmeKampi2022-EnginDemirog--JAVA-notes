package lesson13;

public class Main {

	public static void main(String[] args) {
		// do-while loop
		
		int i = 0;
		
		do {
			System.out.println(i);
			i += 2;
		} while (i < 10);
		
		int k = 10; // k 10 olduğu için şarta uymuyor ve dmngü çalışmayacak ama do içindeki kod çalışacak. yukarıdaki gibi şartı sağlasaydı çalışacaktı
		
		do {
			System.out.println(k);
			k += 2;
		} while (k < 10);
		
		System.out.println(k);
	}

}
