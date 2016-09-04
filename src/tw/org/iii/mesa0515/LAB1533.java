package tw.org.iii.mesa0515;

public class LAB1533 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		//b = 0,產生ArithmeticException,try中判斷為EXCEPTION則會執行CATCH,TRY中斷
		int []d = {1,2,3,4};
		try{
		int c = a/b;
		System.out.println(c);
		System.out.println(d[4]);
		//當d[4]不存在,c存在時會判斷d,d不存在會執行對應的catch
		}catch(ArithmeticException e){
			System.out.println("LAB1533");
		//同時要catch父子類別時,子類別須放在父類別之前,有順序關係
		}catch(RuntimeException re){
			//呼叫父類別同時可執行
		System.out.println("OK");
//		}catch(ArithmeticException e){
//			System.out.println("LAB1533");
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("LAB15");
		}
		System.out.println("LAB");
	}

}
