
public class PracticeOverrRide {

	public static void main(String[] args) {
		Car1 car = new Car1();
		car.setNo(7);
		car.display();
		Taxi1 taxi = new Taxi1();
		taxi.start();
		taxi.run();
		taxi.display();
	}

}

class Car1{
	private int no = 0;
	
	public void setNo(int n) {
		no = n;
	}
	public void display() {
		System.out.println("ナンバーは"+ no +"です。");
	}
}

class Taxi1 extends Car1{
	private int price = 0;
	
	public void start() {
		price = 420;
	}
	
	public void run() {
		price = price + 80;
	}
	//Car1クラスのdisplayメソッドのオーバーライド。
	//オーバーライド時は「戻り値の型、メソッド名、引数の情報」の3つを統一する必要がある
	public void display() {
		System.out.println("料金は"+ price + "円です");
	}
}