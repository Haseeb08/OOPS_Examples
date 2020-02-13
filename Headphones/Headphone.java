package headPhones;

public abstract class Headphone {
	private String brandName;            //Encapsulation
	private int price;
	private boolean bass;
	abstract void diplayDetails();
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isBass() {
		return bass;
	}
	public void setBass(boolean bass) {
		this.bass = bass;
	} 
}
