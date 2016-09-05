package tw.org.iii.mesa0515;

import java.io.FileOutputStream;

public class LAB1539 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("dir1/jamie.txt", true);
			//若檔案不存在則會建立新檔
			//append為true則write字串會變成附加而非取代原有字串(預設為false)
			fos.write("Hello!\n".getBytes());
			//使用write寫入字串,用getbyte轉換成byte,字串改變後會先移除原有再加入新字串
			fos.flush();
			fos.close();
			System.out.println("Write OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
