package mypack;

public class Train extends Vehicle{
	
	//抽象クラスでprotectedされてるからプライベート変数で宣言しなくていい
	//private int crewNum;
	
	public Train(int crewNum) {
		this.crewNum = crewNum;
	}
	
	public void showCrewNum() {
		System.out.println("電車の乗客"+this.crewNum);
	}

}
