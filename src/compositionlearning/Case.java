package compositionlearning;

public class Case {
	private String model;
	private String manufacturar;
	private String powerSupply;
	private Dimensions dimentions; // Composition - Case has got dimension
	
	public Case(String model, String manufacturar, String powerSupply, Dimensions dimentions) {
		super();
		this.model = model;
		this.manufacturar = manufacturar;
		this.powerSupply = powerSupply;
		this.dimentions = dimentions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed!");
	}

	private String getModel() {
		return model;
	}

	private String getManufacturar() {
		return manufacturar;
	}
	
	private String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimentions() {
		return dimentions;
	}

}
