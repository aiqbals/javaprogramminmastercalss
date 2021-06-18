package compositionlearning;

public class Monitor {
	private String model;
	private String manufacturar;
	private int size;
	private Resolution nativeResolution;
	// This is composition. Monitor is not a resolution but it has a Resolution, 
	// That is why, class Resolution is a part of Monitor class
	
	public Monitor(String model, String manufacturar, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturar = manufacturar;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + y + " in color " + color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturar() {
		return manufacturar;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

}
