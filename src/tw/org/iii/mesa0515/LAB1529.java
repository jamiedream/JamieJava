package tw.org.iii.mesa0515;

public class LAB1529 {

	public static void main(String[] args) {
//		LAB15291 obj1 = new LAB15291(1);
//		obj1.m1();
		LAB15292 obj2 = new LAB15292();
//		obj2.m1(); //子物件可自行定義父物件中的函數
//		obj2.m2();
	}

}


class LAB15291{
	int a;
	//父類別為無傳參數obj,可直接使用自己的建構式
//	LAB15291(int b){System.out.println("123");}
//	void m1(){System.out.println("LAB15291:m1");}
}

class LAB15292 extends LAB15291{
	LAB15292(){	
//		super(1);
//		int c;
		System.out.println("456");
		
		
	}
//	void m1(){
//		super.m1();//優先呼叫父類別的void m1
//		System.out.println("LAB15292:m1" + ' '+ a);//繼承LAB15291
//		
//		}
//	void m2(){System.out.println("LAB15292:m2");}
}