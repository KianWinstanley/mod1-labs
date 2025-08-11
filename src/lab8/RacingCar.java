package lab8;

public class RacingCar extends Car{
	private String driver;
	private int turboFactor;
	
	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
	
	public void accelerate() {
		super.accelerate(turboFactor);
	}
	
	public String getDriver() {
		return this.driver;
	}
	
	public String getModel() {
		return super.getModel();
	}
	
	public int getTurboFactor() {
		return this.turboFactor;
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
}
