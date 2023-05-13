
public class StuSample4 {

	public static void main(String[] args) {
		//変数にfinalをつけることで上書きできない変数＝定数に変わる
		final int BASE_NO = 1000;
		Student4 stu1 = new Student4("田中", BASE_NO + 1);
		stu1.display();
		Student4 stu2 = new Student4("佐藤", BASE_NO + 2);
		stu2.display();
	}

}

class Person4{
	private String name;
	
	public Person4(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("名前："+ name);
	}
}

//classにfinalをつけるとこれ以上継承ができなくなる=Student4は継承できない
final class Student4 extends Person4{
	private int stuNo;
	
	public Student4(String name, int stuNo) {
		super(name);
		this.stuNo = stuNo;
	}
	public void display() {
		super.display();
		System.out.println("学籍番号：" + stuNo);
	}
}