package compositionlearning;

public class Main {

	public static void main(String[] args) {
		
		Dimensions dimentions = new Dimensions(20, 0, 5);
		Case theCase = new Case("220B", "Dell", "240", dimentions);

		Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440));
		// new Resolution(2540, 1440) - to avoid extra line creating Resolution obj like Dimension
		
		Motherboard theMotherboard = new Motherboard("BJ-200", "Aus", 4, 6, "v2.44");
		
		Computer pc = new Computer(theCase, theMotherboard, theMonitor);
		pc.getMonitor().drawPixelAt(1500, 1200, "Red");
		pc.getMontherboard().loadProgram("Windows 1.0");
		pc.getTheCase().pressPowerButton();
	}

}
