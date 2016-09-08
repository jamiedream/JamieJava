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

public class LAB1556 {

	public static void main(String[] args) {
		try {
			//input參數到SQL
			URL url = new URL("http://10.1.6.68/web01.php?cname=judy&tel=06123456&birthday=1911-01-01");
			HttpURLConnection conn =  (HttpURLConnection)url.openConnection();
			conn.connect();
			conn.getInputStream();
			
			System.out.println("ok");
			
		} catch (Exception e) {
			
		}

	}

}
