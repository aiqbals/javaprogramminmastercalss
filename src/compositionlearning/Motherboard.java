package compositionlearning;

public class Motherboard {
	private String model;
	private String manufacturar;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	public Motherboard(String model, String manufacturar, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufacturar = manufacturar;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is now laoding...");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturar() {
		return manufacturar;
	}


	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public String getBios() {
		return bios;
	}


	
	
	
	
}
