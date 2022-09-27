package constructors;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"laptop","Asus Laptop",3350);
		System.out.println(product.getName());
		
		Product product2 = new Product();//overloading yaptığımız için bu yöntemle de tanımlayabiliriz
		product2.setId(2);
		product2.setName("Masaüstü");
		product2.setDescription("Asus Masaüstü");
		product2.setPrice(6999);
		
		System.out.println(product2.getName());
		
		Product product3 = new Product(1,"laptops","Asusss Laptop",3350);
		System.out.println(product3.getName());
	}

}
