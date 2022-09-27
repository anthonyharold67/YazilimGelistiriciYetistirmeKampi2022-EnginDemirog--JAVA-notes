package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(2, 5));//7
		
		//overloading-3 sayı alabilir hale getirmiş olduk
		System.out.println(dortIslem.topla(2, 5, 3));

	}

}
