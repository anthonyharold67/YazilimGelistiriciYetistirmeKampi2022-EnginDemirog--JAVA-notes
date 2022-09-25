package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBC database e veri kaydetme
		
		System.out.println("ürün eklendi : " + product.name);
	}

}
