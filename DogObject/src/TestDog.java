
public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The object one
		System.out.println("The object one :");
		Dog Dog1Object = new Dog("Bulldog", "large", "light gray", "5 years");
		System.out.println(Dog1Object.eat());
		System.out.println(Dog1Object.run());
		System.out.println(Dog1Object.sleep());
		System.out.println(Dog1Object.name());

		System.out.println("--------------------");

		// The object two
		System.out.println("The object two :");
		Dog Dog2Object = new Dog("Beagle", "large", "orange", "6 years");
		System.out.println(Dog2Object.eat());
		System.out.println(Dog2Object.run());
		System.out.println(Dog2Object.sleep());
		System.out.println(Dog2Object.name());

		System.out.println("--------------------");

		// The object three
		System.out.println("The object three :");
		Dog Dog3Object = new Dog("German Shepherd", "large", "white & orange", "6 years");
		System.out.println(Dog3Object.eat());
		System.out.println(Dog3Object.run());
		System.out.println(Dog3Object.sleep());
		System.out.println(Dog3Object.name());

	}

}
