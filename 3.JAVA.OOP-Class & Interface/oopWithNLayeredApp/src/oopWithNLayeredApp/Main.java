package oopWithNLayeredApp;

import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// Product product1 = new Product(1,"Iphone Xs",9);//hata fırlatıyor çünkü 10
		// dan küçük
		Product product2 = new Product(1, "Iphone Xr", 10000);

		// ProductManager productManager = new ProductManager();
		// productManager.add(product1);
		// productManager.add(product2);
		Logger[] loggers = {new DatabaseLogger() , new FileLogger()}; 

		// manager in hangi yöntemle geldiği umrunda değil :
		//ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		// productManager.add(product1);
		//productManager.add(product2);
		
		//aynı anda hepsine logger gönderme
		

		ProductManager productManager2 = new ProductManager(new HibernateProductDao(), loggers);
		// productManager.add(product1);
		productManager2.add(product2);
	}

}

//Arkadaşlar bizim extends değil de implement kullanmamızın sebebi o zaman bağımlılığı keserek farklı classları referans etmesini sağlamak
