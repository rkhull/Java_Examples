public class Chapter6_PersonDemo {

	public static void main(String[] args) {
		Chapter6_Person caseWebb = new Chapter6_Person("Case Webb", 23);
		Chapter6_Person kyliBishop = new Chapter6_Person("Kyli McKay-Bishop", 27);

		System.out.println("Case and Kyli are the same age? " + caseWebb.sameAge(kyliBishop));

		Chapter6_Person babyCase = caseWebb.hadAKid("Baby Case");
		System.out
				.println(caseWebb.getName() + " had a baby named " + babyCase.getName() + " who is " + babyCase.getAge() + " year(s) "
						+ "old");

		Chapter6_Person babyCasey = caseWebb.hadAKid("Baby Casey", 2);
		System.out
				.println(caseWebb.getName() + " had a baby named " + babyCasey.getName() + " who is " + babyCasey.getAge() + " year(s) "
						+ "old");
	}
}
