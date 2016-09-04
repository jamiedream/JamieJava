package hw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//reader
public class IOR {

	public static void main(String[] args) throws FileNotFoundException {
		Reader f1 = new FileReader("./dir1/test.txt");
		//讀f1
		try {
			char[] buf = new char[f1.read()];
			//reader只能讀字元,new個字元陣列
			f1.read(buf);
			//將f1放入buf中
			System.out.println(buf);
			//讀物件buf
			
			f1.close();
			System.out.println("ok");
		} catch (IOException e) {
			System.out.println(e.toString());
		}


		
		
	}

}
