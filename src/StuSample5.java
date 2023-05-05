
class StuSample5 {

	public static void main(String[] args) {
		//サブクラスのオブジェクトを作成
		Student5 stu1 = new Student5("井上",1);
		//親クラスにサブクラスを代入する場合は自動でキャストされる
		//スーパー=サブの関係
		Person5 psn = stu1;
		//サブクラスを代入してるからこのdisplayメソッドはStudent5クラスのdisplayメソッド
		psn.display();
		
		//instanceof = インスタンスの有無の確認
		//psnオブジェクトはStudent5クラスのインスタンスですか？と聞いている状態
		//Javaにおけるインスタンスとは、クラスを基に生成されたオブジェクトのこと
		//TrueかFalseでかえってくる
		if(psn instanceof Student5) {
			//サブクラスに親クラスを代入する際にはキャストを明示する
			//サブ=スーパーの関係
			Student5 stu2 = (Student5)psn;
			stu2.chgStuNo(1001);
			stu2.display();
		}

	}

}

class Person5{
	private String name;
	
	public Person5(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("名前：" + name);
	}
}

class Student5 extends Person5{
	private int stuNo;
	public Student5(String name, int stuNo) {
		super(name);
		this.stuNo = stuNo;
	}
	public void display() {
		super.display();
		System.out.println("学籍番号：" + stuNo);
	}
	public void chgStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
}
