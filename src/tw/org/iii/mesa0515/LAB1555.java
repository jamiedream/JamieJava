package tw.org.iii.mesa0515;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.GeneralSecurityException;

public class LAB1555 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://pdfmyurl.com?url=https://tw.yahoo.com");
			HttpURLConnection conn =  (HttpURLConnection)url.openConnection();
			
			// buffer無法處理圖檔
//			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//			String line;
//			while((line = reader.readLine()) != null){
//				System.out.println(line);
//			}
//			reader.close();
			// I/O處理圖檔
			InputStream in = conn.getInputStream();
			FileOutputStream fout = new FileOutputStream("dir1/jamie2.pdf");
			byte[] buf = new byte[1024]; int len;
			while( (len = in.read(buf)) != -1){
				fout.write(buf, 0, len);
			}
			
			fout.flush();
			fout.close();
			in.close();
			
			System.out.println("ok");
			
		} catch (Exception e) {
			
		}

	}

}
