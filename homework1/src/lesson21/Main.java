package lesson21;

public class Main {

	public static void main(String[] args) {
		//mükemmel sayılar (kendisini bölen sayılara eşitse mükemmeldir )
		
		int number = 28;
		
		int total = 0;
		
		for (int i = 1;i<number;i++) {
			if(number % i == 0) {
				total += i;
			}
		}
		
		if(total == number) {
			System.out.println("Sayı mükemmel sayıdır : " + number);
		}else {
			System.out.println("Sayı mükemmel sayı değildir : " + number);
		}
		
	}

}
