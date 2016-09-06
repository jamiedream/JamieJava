package tw.org.iii.mesa0515;

public class LAB1547 {
//Thread執行緒
	public static void main(String[] args) {
		LAB15471 obj1 = new LAB15471("A");
		LAB15471 obj2 = new LAB15471("B");
		LAB15472 obj3 = new LAB15472("C");
		Thread t1 = new Thread(obj3);
//		obj1.run();
//		obj2.run();
		//run一個接一個
		obj1.start();
		obj2.start();
		t1.start();
		//start同時,一個物件只能執行一次start
		//執行時間會大於等於睡眠時間,看cpu怎麼選
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		System.out.println("MAIN");
		//執行緒要看cup怎麼選擇sysout可能為一二三列
		obj2.interrupt();
		//obj2 break
		
	}

}
class LAB15471 extends Thread{
	String name;
	LAB15471(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);//停頓時間
				
			} catch (InterruptedException e) {
				break;
			}
			
		}
	}
}
class LAB15472 implements Runnable {
	String name;
	LAB15472(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);//停頓時間
				
			} catch (InterruptedException e) {
				break;
			}
			
		}
	}
}