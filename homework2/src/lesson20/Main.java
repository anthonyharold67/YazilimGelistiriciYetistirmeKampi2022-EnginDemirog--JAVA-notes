package lesson20;

public class Main {

	public static void main(String[] args) {
		// kalın ve ince sesli harfler
		String harf = "E";
		
		String kalınHarf = "AIOUaıou";
		String inceHarf = "EİÖÜeiüö";
		
		if(kalınHarf.indexOf(harf)> -1) {
			System.out.println("Kalın sesli harf : " + harf);
		}else if (inceHarf.indexOf(harf)>-1) {
			System.out.println("İnce sesli harf : " + harf);
		}else {
			System.out.println("Girdiğiniz harf ne kalın ne de ince sesli bir harftir");
		}

	}

}
