package tw.org.iii.mesa0515;

public class LAB1534 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		//class Bird中宣告例外發生,可利用這個宣告在相關函式中做不同的應用
		try{
	    b.BirdLeg(-2);
		}catch(Exception a){
			System.out.println("123");
		}
		//void宣告了Exception後,必須在相關函式中進行判斷
		
	}

}
class Bird {
	int leg;
	void BirdLeg(int n) throws Exception{
//		宣告拋出例外exception
		if( n < 0 || n>2){
			throw new RuntimeException();
			//拋出已存在類別,則不須在void中進行宣告,相關函式也可不宣告
			//但若在void中宣告了另一個exception,則相關函式還是必須進行對應判斷
//			throw new Exception();
//			拋出例外exception
		}
		leg = n;
	}
	
}