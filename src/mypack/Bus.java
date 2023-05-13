package mypack;

public class Bus extends Vehicle implements Stopable{
	
	//private int crewNum;
	
	public Bus(int crewNum) {
		this.crewNum = crewNum;
	}
	
	public void showCrewNum() {
		System.out.println("バスの乗客"+this.crewNum);
	}
	
	public void stop() {
		System.out.println("次止まります");
	}

}