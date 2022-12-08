
public class Dog {
	private String name;
	public String breed;
	private int age;

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	public Dog(String n, int a) {

		this.name = n;
		this.age = a;
	}

	public Dog(String n, String b, int a) {

		this.name = n;
		this.breed = b;
		this.age = a;
	}

//public Barking b;b=new Barking(); //메소드 어케하는지 모르겠음. p188

}
