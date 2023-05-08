
public class StuSample6 {

	public static void main(String[] args) {
		TandF taf = new TandF("陸上競技部");
		Football fb = new Football("サッカー部");
		
		Student6 stu1 = new Student6("井上",taf);
		stu1.display();
		stu1.practice();
		
		Student6 stu2 = new Student6("桜井",fb);
		stu2.display();
		stu2.practice();
	}

}

//抽象クラス＝抽象メソッドを使う場合はabstractをつける
abstract class Club{
	private String name;
	
	public Club(String name) {
		//private変数のnameに引数のnameを代入
		this.name = name;
	}
	public void display() {
		System.out.println("部活動"+ name);
	}
	//抽象メソッド。サブクラスでオーバーライドされる
	//抽象メソッドは継承されたサブクラスで必ずオーバーライドされる必要がある。
	public abstract void practice();
}

//抽象クラスを継承している
//=practiceメソッドのオーバーライドが必要
class TandF extends Club{
	public TandF(String name) {
		//親クラスのコンストラクタの呼び出し
		super(name);
	}
	public void practice() {
		System.out.println("ウォームアップ");
		System.out.println("インターバル");
		System.out.println("筋肉トレーニング");
	}
}

class Football extends Club{
	public Football(String name) {
		//親クラスのコンストラクタの呼び出し
		super(name);
	}
	public void practice() {
		System.out.println("ドリブル");
		System.out.println("シュート");
		System.out.println("ミニゲーム");
	}
}

class Student6{
	private String name;
	//Clubオブジェクト
	//Clubクラスのオブジェクトを作っている
	private Club club;
	
	public Student6(String name, Club club) {
		this.name = name;
		//clubオブジェクトの中身を任意のオブジェクトに変える
		this.club = club;
	}
	public void display() {
		System.out.println("名前"+ name);
		//clubに代入されたオブジェクトのクラスのdisplayメソッドが呼び出される
		//ex clubにtafオブるにイェくとが代入されたら
		//taf.display==super(name);==System.out.println("部活動"+ name);
		club.display();
	}
	public void practice() {
		club.practice();
	}
}