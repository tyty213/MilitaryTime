package militaryTime;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Times timesObject = new Times(18, 5, 6);
		

		System.out.println(timesObject.toMilitary());
		System.out.println(timesObject.toNorm());
	}

}
