package usingMultiConstructors;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToMilitary militaryObject = new ToMilitary();
		ToMilitary militaryObject2 = new ToMilitary(5);
		ToMilitary militaryObject3 = new ToMilitary(5, 13);
		ToMilitary militaryObject4 = new ToMilitary(5, 13, 43);
		
		//Testing new repo
		
		System.out.printf("%s\n", militaryObject.toMilitary());
		System.out.printf("%s\n", militaryObject2.toMilitary());
		System.out.printf("%s\n", militaryObject3.toMilitary());
		System.out.printf("%s\n", militaryObject4.toMilitary());
	}
}
