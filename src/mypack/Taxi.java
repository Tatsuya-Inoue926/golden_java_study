package mypack;

public class Taxi extends Vehicle implements Stopable{
	
	//private int crewNum;
	
	public Taxi(int crewNum) {
		this.crewNum = crewNum;
	}
	
	public void showCrewNum() {
		System.out.println("タクシーの乗客"+this.crewNum);
	}
	
	public void stop() {
		System.out.println("ここで止まります");
	}

}
