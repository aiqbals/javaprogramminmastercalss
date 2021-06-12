package classlearning;

public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("carrera") || validModel.equals("commodore")) {
			this.model = model;
		}
	}
	
	public String getModel() {
		return this.model;
	}
	// setting getting value for private field is called encapsulation. 
	// This is safer and obj are more valid, have been validated and are correct.
}
