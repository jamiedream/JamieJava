package tw.org.iii.mesa0515;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.BitSet;

public class LAB1542 {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois = 
					new ObjectInputStream(
							new FileInputStream("dir1/data.dat"));
			Object obj = ois.readObject();
			student s1 = (student)obj;
			ois.close();
			System.out.println(s1.getName());
			System.out.println(s1.getScore());
			System.out.println(s1.getAvg());
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.toString());
		}

	}

}
