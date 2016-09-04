package tw.org.iii.mesa0515;

public class LAB1535 {

	public static void main(String[] args) {
		LAB15351 obj1 = new LAB15351();
		obj1.m1();

	}

}
class LAB15351{
	int a = 10, b = 0;
	void m1(){
		try{
			System.out.println(a/b);
			return;
//		}catch(Exception e){
//			System.out.println("LAB15351:m1()");
////			return;
		}finally{
			System.out.println("FINAL");
			//不判斷例外,若例外發生時會先執行final再判斷例外
//			finally在try,catch結構中為return前一定要執行的任務
		}
//		System.out.println("OVER");
////		try,catch都return則永遠不會執行over
	}
	
}