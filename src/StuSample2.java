
class StuSample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student2 stu = new Student2();
        stu.setName("ああ");
        stu.setStuNo(2);
        stu.display();
}
}

//オーバーライド=メソッドの上書き。サブクラスにもスーパークラスと同じメソッド名があること
class Person2{
    private String name;
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("名前："+ name);
    }
}

class Student2 extends Person2{
    private int stuNo;

    public void setStuNo(int s){
        stuNo = s;
    }
    public void display(){
    	//private変数のnameはPerson2クラス内でしか使えないため、
    	//継承で使用可能にしたgetNameメソッドを用いてnameの内容を取得
        System.out.println("名前："+ getName());
        System.out.println("学籍番号："+ stuNo);
    }
}

