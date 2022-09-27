package constructors;

public class Product {

	public Product(int id, String name, String description, double Price) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.description = description;
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		System.out.println("Overloading işlemi yaptık yani hem constructor kısmında tanımlaybiliyoruz hem de aşağıdaki gibi");
	}
	
	private int id;
	private String name;
	private String description;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
