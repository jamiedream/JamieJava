package tw.org.iii.mesa0515;

public class LAB152931 {

	public static void main(String[] args) {

		LAB15312 obj1 = new LAB15312();
		LAB15313 obj2 = new LAB15313();
		
		LAB15314 obj3 = new LAB15314();
		obj3.m3(obj2);
	}

}

interface LAB15311{
	void m1();
	void m2();
	//interface中void不能有{}--定義
	//interface本身就是public,不需要特地宣告
}
class LAB15312 implements LAB15311{
	//LAB15312實作1
	public void m1(){System.out.println("LAB15312:m1()");}
	public void m2(){System.out.println("LAB15312:m2()");}
	//宣告public
}
class LAB15313 implements LAB15311{
	//LAB15313實作1
	public void m1(){System.out.println("LAB15313:m1()");}
	public void m2(){System.out.println("LAB15313:m2()");}
}
class LAB15314{
	void m3(LAB15311 b){
		b.m1();
		b.m2();
		//在m3中利用b呼叫m1,m2
	}
	
}

//34