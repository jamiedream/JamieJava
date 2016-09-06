package tw.org.iii.mesa0515;

import java.util.Timer;
import java.util.TimerTask;

public class LAB1548 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Mytask task1 = new Mytask("A");
		Mytask task2 = new Mytask("B");
		timer.schedule(task1, 0, 1000);
		timer.schedule(task2, 0, 300);
//		timer.schedule(task2, 3000, 1000);//物件,開始時間,間隔時間

	}

}
class Mytask extends TimerTask{
	private String name;
	private int i;
	Mytask(String name) {this.name = name;}
	@Override
	public void run() {
		System.out.println(name+ i++);
	}	
}