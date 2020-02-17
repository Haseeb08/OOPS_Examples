package Watch;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Watch {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getTime() {
		return (LocalTime.now()).toString();
	}
	public String getDate() {
		return (LocalDate.now()).toString();
	}
	abstract void display();
}
