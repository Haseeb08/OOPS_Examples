package TV;

public class LED extends TV implements Soundcard,Hometheatre {
	@Override
	void displayType() {
		System.out.println("\nType: LED");
	}
	@Override
	public void ht() {
		System.out.println("Home Theartre connected.");
	}
	@Override
	public void sd() {
			System.out.println("Supported by Dolby Atmos.");
		}
}