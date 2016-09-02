package tw.org.iii.mesa0515;

public class LAB1532 {
//抽象類別abstract
	public static void main(String[] args) {
		LAB15321 obj1 = new LAB15321();
		//LAB15322 obj2 = new LAB15322();
		//抽象類別有void未定義,若有建構式可將內容傳遞給其子類別
		//但無法呼叫自身
		LAB15322 obj3 = new LAB15323();
	}

}
class LAB15321{
	void m1(){}
	void m2(){}
}
abstract class LAB15322{
	LAB15322(){
		System.out.println("LAB15322()");
	}
	void m1(){}
	//與LAB15321的m1不同
	abstract void m2();
}
class LAB15323 extends LAB15322{
	void m2(){System.out.println("LAB15323.m2()");}
}
class LAB15324 extends LAB15322{
	void m2(){System.out.println("LAB15324.m2()");}
}
//父類別LAB15322沒有做的,子類別一定要做,不然也要以抽象類別存在

