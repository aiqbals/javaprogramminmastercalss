package classlearning;

public class Main {

	public static void main(String[] args) {
		
		Car porche = new Car();
		Car holen = new Car();
		//System.out.println(porche.getModel()); // model is String class obj return null
		porche.setModel("carrera");
		System.out.println(porche.getModel());
	}

}
