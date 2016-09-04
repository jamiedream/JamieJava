package tw.org.iii.mesa0515;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.AbstractDocument.LeafElement;

public class LAB1537 {

	public static void main(String[] args) {
		File f1 = new File("./dir1/test.txt");
//		System.out.println(f1.getAbsolutePath());
		
//		if(f1.exists()){
//			System.out.println("OK");
//		}
		
		try {
			FileInputStream fis = new FileInputStream(f1);
			//需呼叫exception
//			int c;
			long len = f1.length();
			//取得fl檔案的長度
			byte[] buf = new byte[(int)len];
			//將長度轉成int存入buf
			fis.read(buf);
			//將fis檔案轉入buf物件
			System.out.println(new String(buf));
			//讀取buf->字串
			
//			while((c = fis.read(buf)) != -1){
//				
//				System.out.print(new String(buf, 0, c));
//				System.out.println((char).c);
				//讀c的字
//			}
			//讀檔案
			
			fis.close();
			System.out.println("OK");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
		
	}

}
