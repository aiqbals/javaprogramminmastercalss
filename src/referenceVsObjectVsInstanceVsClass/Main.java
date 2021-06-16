package referenceVsObjectVsInstanceVsClass;

public class Main {

	public static void main(String[] args) {
		
		House blueHouse = new House("Red");
		// blueHouse refer to the obj of type House in memory that has Red
		House anotherHouse = blueHouse;
		// anotherHouse refer to the same object in memory
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		anotherHouse.setColor("Blue");
		// both obj value now set to Green
		System.out.println("--------------------------");
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		House greenHouse = new House("Green");
		anotherHouse = greenHouse;
		System.out.println("--------------------------");
		System.out.println(greenHouse.getColor());
		System.out.println(anotherHouse.getColor());
		System.out.println(blueHouse.getColor());

	}

}
