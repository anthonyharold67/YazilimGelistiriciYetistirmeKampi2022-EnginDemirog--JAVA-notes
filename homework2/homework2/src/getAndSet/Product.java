package getAndSet;

public class Product {
	// getter and setters
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	public int getId() {
		return _id;
	}

	// set metodunda set edilcek değeri parametre olarak veriyoruz
	public void setId(int id) {
		// this.id = id;//içinde bulunduğun classı demek istiyoruz.ama best preactice
		// fieldların başına_ koyuyoruz karışmaması için
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String _description) {
		this._description = _description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double _price) {
		this._price = _price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String getRenk() {
		return _renk;
	}

	public void setRenk(String _renk) {
		this._renk = _renk;
	}

	public String getKod() {
		return this._name.substring(0,1) + _id;
	}

}
