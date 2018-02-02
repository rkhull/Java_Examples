public class Chapter6_Person {

	private String name;

	private int age;

	public Chapter6_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public boolean sameAge(Chapter6_Person otherPerson) {
		return this.age == otherPerson.getAge();
	}

	public Chapter6_Person hadAKid(String kidsName) {
		return new Chapter6_Person(kidsName, 0);
	}

	public Chapter6_Person hadAKid(String kidsName, int kidsAge) {
		return new Chapter6_Person(kidsName, kidsAge);
	}
}
