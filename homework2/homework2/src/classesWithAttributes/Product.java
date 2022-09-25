package classesWithAttributes;

public class Product {
	// fields & attributes
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
	
	//encapsulation
	private String renk; // buna sadece bu blok içinde erişilebilir 
	private String kod = name + id; 

}
