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

public class LAB1557 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost/query.php");
			HttpURLConnection conn =  (HttpURLConnection)url.openConnection();
			
			// buffer無法處理圖檔
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			
			while((line = reader.readLine()) != null){
				String[] data = line.split(":");
				System.out.println(
						data[0] + "-" + 
						data[1] + "-" +
						data[2]);
				
			}
			reader.close();

			System.out.println("ok");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
