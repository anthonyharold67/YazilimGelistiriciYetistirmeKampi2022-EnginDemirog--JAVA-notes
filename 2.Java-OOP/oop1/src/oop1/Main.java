package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		          // set value (backend)
		//product1.name = "Delonghi Kahve Makinesi";
		//product1.unitPrice = 7500;
		//product1.discount = 7;
		//product1.unitsInStock = 3;
		//product1.imageUrl = "bilmemne.jpg";
		
		// set metodu
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmemne.jpg");

		         // get value (frontend)
		// System.out.println(product1.name);

		Product product2 = new Product();
		//product2.name = "Smeg Kahve Makinesi";
		//product2.unitPrice = 6500;
		//product2.discount = 8;
		//product2.unitsInStock = 6;
		//product2.imageUrl = "bilmemne2.jpg";
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(10);
		product2.setUnitsInStock(30);
		product2.setImageUrl("bilmemne2.jpg");

		Product product3 = new Product();
		//product3.name = "Kitchen Aid Kahve Makinesi";
		//product3.unitPrice = 4500;
		//product3.discount = 10;
		//product3.unitsInStock = 10;
		//product3.imageUrl = "bilmemne3.jpg";
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(3500);
		product3.setDiscount(15);
		product3.setUnitsInStock(40);
		product3.setImageUrl("bilmemne3.jpg");
		
		Product[] products = {product1,product2,product3};//product nesnesi verebiliyoruz array içine+
		
		// arraylere foreeach kullanarak girebiliyoruz
		for (Product product : products) {
			//System.out.println(product.name);
			System.out.println(product.getName());//getter ile okuma
		}
		
		//inheritance 
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("055522222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Anthony");
		individualCustomer.setLastName("Harold");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("5689655555");
		corporateCustomer.setTaxNumber("111111111111");
		corporateCustomer.setCustomerNumber("543215");
		
		Customer[] customers = {individualCustomer,corporateCustomer};//kendisinden üretildiği için atama da problem yaşamıyoruz

	}

}
