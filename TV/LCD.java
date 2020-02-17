package TV;

public class LCD extends TV implements Hometheatre {
	@Override
	void displayType() {
		System.out.println("\nType: LCD");
	}
	@Override
	public void ht() {
		System.out.println("Home Theartre connected.");
	}
}
