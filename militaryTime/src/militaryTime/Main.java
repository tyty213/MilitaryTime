package militaryTime;

/*
 * Tylor Graham
 * 01/11/18
 * Reinforcing constructors and .this keyword
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Times timesObject = new Times(18, 5, 6);	//creates new object
		

		System.out.println(timesObject.toMilitary());	//calls the given values to be printed as military time
		System.out.println(timesObject.toNorm());		//calls the given values to be printed as normal time
	}

}
