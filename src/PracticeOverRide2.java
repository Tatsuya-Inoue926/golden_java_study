
public class PracticeOverRide2 {
	
	public static void main(String[] args) {
		Taxi2 taxi = new Taxi2(2525);
		taxi.start();
		taxi.run();
		taxi.display();
	}

}

class Car2{
	private int no = 0;
	
	public Car2(int no) {
	//this.no = private int noのno
	//no = 引数のno
		this.no = no;
	}
	public void display() {
		System.out.println("ナンバーは"+ no +"です。");
	}
}

class Taxi2 extends Car2{
	private int price;
	
	//コンストラクタ(引数1)
	public Taxi2(int no) {
		//親クラス(Car2)の引数1のコンストラクタの呼び出し
		super(no);
		price = 0;
	}
	
	//コンストラクタオーバーロード(引数2）
	public Taxi2(int no, int price) {
		//親クラス(Car2)の引数1のコンストラクタの呼び出し
		super(no);
		//this.price = private int priceのprice
		this.price = price;
	}
	public void start() {
		price = 420;
	}
	
	public void run() {
		price = price + 80;
	}
	//Car2クラスのdisplayメソッドのオーバーライド。
	//オーバーライド時は「戻り値の型、メソッド名、引数の情報」の3つを統一する必要がある
	public void display() {
		//親クラスのdisplayメソッドの呼び出し。
		//「ナンバーはnoです」が表示される
		super.display();
		System.out.println("料金は"+ price + "円です");
	}
//+a サブクラスのコンストラクタを呼び出す時にsuper()が呼び出される。明示しなくても呼び出される
}
