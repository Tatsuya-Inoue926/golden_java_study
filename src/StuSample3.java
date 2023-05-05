
public class StuSample3 {

	public static void main(String[] args) {	
		// TODO 自動生成されたメソッド・スタブ
		Student3 stu = new Student3("井上");
		stu.display();
	}

}

class Person3{
	private String name;
	
	public Person3(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("名前：" + name);
	}
}

class Student3 extends Person3{
	private int stuNo;
	
	//①まずこのコンストラクタが呼び出される
	public Student3(String name) {
		//②引数2つのStudent3コンストラクタが呼び出される
		this(name, 999);
	}
	//③コンストラクタが呼び出されて親クラス(Person3)のコンストラクタが呼び出される
	public Student3(String name, int stuNo) {
		super(name);
		//this.stuNoはprivate stuNoのことをさす。
		//private stuNoに引数のstuNoを代入する
		this.stuNo = stuNo;
	}
	public void display() {
		//親クラス(Person3)のdisplayメソッドの呼び出し後に学籍番号の表示
		super.display();
		System.out.println("学籍番号："+ stuNo);
	}
}