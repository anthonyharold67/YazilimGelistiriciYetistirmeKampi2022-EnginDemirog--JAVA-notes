package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// fields & attributes

		Product product = new Product();
		product.name = "Laptop";
		product.id = 1;
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 20;

		System.out.println(product.name);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);// ProductManagerın Add metodunu tanımaklrken bir tane Product nesnesi alcağını
									// belirttik o yüzden burada nesneyi verebiliyoruz

	}

}
