
public class Dog {

	String breed;
	String size;
	String colour;
	String age;

	Dog() {

	}

	Dog(String newBreed, String newSize, String newColour, String newAge) {

		breed = newBreed;
		size = newSize;
		colour = newColour;
		age = newAge;

	}

	String eat() {
		return breed;
	}

	String run() {
		return size;
	}

	String sleep() {
		return colour;
	}

	String name() {
		return age;
	}
}
