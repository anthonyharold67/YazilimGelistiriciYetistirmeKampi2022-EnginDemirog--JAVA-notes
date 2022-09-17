package lesson15;

public class Main {

	public static void main(String[] args) {
		// recap 2
		
		double[] myList = {1.2,1.3,1.4,4.1,5.6};
		double max = myList[0];
		
		for (double number : myList) {
			System.out.println(number);
		}
		
		double total = 0;
		
		for (double number : myList) {
			total += number;
		}
		System.out.println("Total = " + total);
		
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
		}
		System.out.println("Max = " + max);

	}

}
