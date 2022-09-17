package lesson19;

public class Main {

	public static void main(String[] args) {
		// asal sayı
		int number = 21;
		//number = 17;
		//number=1;
		boolean isPrime = true;
		
		if (number>=2) {
			if (number==2) {
				isPrime = true;
			}
			else if (number % 2 == 0) {
				isPrime = false;
			} else {
				for (int i = 2; i < number; i++) {
					if (number % i == 0) {
						isPrime = false;
					}
				}
				
			}
		}else {
			isPrime = false;
		}
		
		System.out.println("isPrime : " + isPrime);

	}

}
