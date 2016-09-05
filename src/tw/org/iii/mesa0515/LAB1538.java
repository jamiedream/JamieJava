package tw.org.iii.mesa0515;

import java.io.File;
import java.io.FileReader;

public class LAB1538 {

	public static void main(String[] args) {
		File f1 = new File("./dir1/test.txt");
		try {
			FileReader reader = new FileReader(f1);
			
			int c;
			while((c = reader.read()) != -1){
				System.out.print((char)c);
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
