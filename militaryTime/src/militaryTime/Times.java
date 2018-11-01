package militaryTime;

public class Times {

	private int hour;		//declares required fields
	private int minute;
	private int second;
	
	public Times(int hour, int minute, int second) {	//constructor
		
		this.hour = ((hour >=0 && hour<24) ? hour : 0);			//validates times and sets values
		this.minute = ((minute>=0 && minute<60) ? minute : 0);
		this.second = ((second >=0 && second <60) ? second : 0);
		
	}

	
	public String toMilitary() {
		
		return String.format("%02d:%02d:%02d", hour, minute, second);	//outputs formatted military time
		
	}
	
	public String toNorm() {
		
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour%12), minute, second, ((hour >12) ? "PM" : "AM" ));	//outputs formatted normal time
		
	}
}
