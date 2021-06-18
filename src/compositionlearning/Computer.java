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

	public Case getTheCase() {
		return theCase;
	}

	public Motherboard getMontherboard() {
		return montherboard;
	}


	public Monitor getMonitor() {
		return monitor;
	}
}
