package Vehicle2;

public class SUV extends Vehicle implements IRadio{
	private boolean radio;
	@Override
	public void setRadioOn() {
		radio=true;
	}
	@Override
	public void setRadioOff() {
		radio=false;
	}
	@Override
	public boolean radioStatus() {
		return radio;
	}	
}