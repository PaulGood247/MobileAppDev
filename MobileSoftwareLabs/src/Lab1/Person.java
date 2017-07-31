package Lab1;

public class Person {

	private String name;
	private char gender;
	
	
	@Override
	public String toString() {
		return "This person is " + name + " , whose gender is " + gender ;
	}

	public Person(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public void printName()
	{
		System.out.println("The persons name is "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
