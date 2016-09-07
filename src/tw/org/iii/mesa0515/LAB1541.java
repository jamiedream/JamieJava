package tw.org.iii.mesa0515;

import java.awt.event.FocusEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//物件序列化
public class LAB1541{

	public static void main(String[] args) {
		student s1 = new student("Jamie", 76, 58, 98);
		System.out.println(s1.getName());
		System.out.println(s1.getScore());
		System.out.println(s1.getAvg());
				
		try {
			ObjectOutputStream oos = 
					new ObjectOutputStream(
							new FileOutputStream("dir1/data.dat"));
			oos.writeObject(s1);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			System.out.println("Exception:"+e.toString());
		} 

	}

}
class student implements Serializable {
	//序列化
	int ch, eng, math;
	String name;
	student(String name, int ch, int eng, int math){
		this.name = name;
		this.ch = ch; this.eng = eng; this.math = math;
	}
	String getName(){return name;}
	int getScore(){return ch+eng+math;}
	double getAvg(){return getScore()/3.0; }
}
