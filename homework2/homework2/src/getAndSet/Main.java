package getAndSet;

import getAndSet.Product;
import getAndSet.ProductManager;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(20);

		System.out.println(product.getId());
		System.out.println(product.getKod());
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
