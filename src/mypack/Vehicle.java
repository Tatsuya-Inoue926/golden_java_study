package mypack;

public abstract class Vehicle {
	//protectedで継承したクラスでもcrewNum変数が使えるようにしている
	protected int crewNum;
	public abstract void showCrewNum();
}
