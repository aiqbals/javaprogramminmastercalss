package compositionlearning;

public class Computer {
	private Case theCase; // Composition - Computer has Case
	private Motherboard montherboard; // Composition - Computer has Motherboard
	private Monitor monitor; // Composition - Computer has Monitor
	
	public Computer(Case theCase, Motherboard montherboard, Monitor monitor) {
		super();
		this.theCase = theCase;
		this.montherboard = montherboard;
		this.monitor = monitor;
	}

//	private Case getTheCase() {
//		return theCase;
//	}
//
//	private Motherboard getMontherboard() {
//		return montherboard;
//	}
//
//
//	private Monitor getMonitor() {
//		return monitor;
//	}
	
	public void powerUp() {
		//getTheCase().pressPowerButton(); // Accessing Case method by getter when public
		theCase.pressPowerButton(); // when make the methods private instead of public
		drawLogo();
	}
	
	private void drawLogo() {
		// Facny graphics
		// getMonitor().drawPixelAt(1200, 50, "Yellow"); // Accessing Monitor method by getter when public
		monitor.drawPixelAt(1200, 50, "Yellow"); // when make the methods private instead of public
	}
}
