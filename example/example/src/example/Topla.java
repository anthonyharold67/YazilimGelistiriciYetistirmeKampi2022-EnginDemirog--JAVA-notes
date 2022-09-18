package example;

public class Topla {

	public void topla(int[] numbers) {
		int toplam = 0;
		
		for (int i : numbers) {
			toplam += i;
		}
		System.out.println(toplam);

	}

}