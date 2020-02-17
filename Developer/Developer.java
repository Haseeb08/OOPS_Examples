package Developer;

abstract public class Developer {
	private String name;
	private float exp;
	abstract void  developerDetails();
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
