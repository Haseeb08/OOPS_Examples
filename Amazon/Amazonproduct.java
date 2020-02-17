package Amazon;

class Amazonproduct {
private String productName;
private int productPrice;
	public Amazonproduct(String productName,int productPrice){
		this.productName=productName;
		this.productPrice=productPrice;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public String getProductName() {
		return productName;
	}
}

class Electronicproducts extends Amazonproduct {

	public Electronicproducts(String productName, int productPrice) {
		super(productName, productPrice);		
	}
	
	
}

class Cothing extends Amazonproduct {

	public Cothing(String productName, int productPrice) {
		super(productName, productPrice);
	}
	
}