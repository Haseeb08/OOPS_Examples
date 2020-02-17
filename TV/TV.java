package TV;

public abstract class TV {
	public void changeChannel() {
		System.out.println("Channel changed");
	}
	public void changeChannel(int no) {
		System.out.println("Channel changed to "+no);
	}
	public void increaseVolume() {
		System.out.println("Volume Increased.");
	}
	public void decreaseVolume() {
		System.out.println("Volume decreased.");
	}
	abstract void displayType();
}
