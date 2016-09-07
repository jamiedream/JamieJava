package tw.org.iii.mesa0515;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class LAB1553 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			
			File sendfile = new File("dir1/Yosemite.jpg");
			FileInputStream fis = new FileInputStream(sendfile);
			byte[] buf = new byte[(int)sendfile.length()];
			fis.read(buf);
			fis.close();
			
			Socket socket = new Socket(InetAddress.getByName("10.1.6.68"), 8000);
			OutputStream out = socket.getOutputStream();
			int b;
			while((b = fis.read())!= -1){
				out.write(b);
			}
			out.write(buf);
//			out.write("Hello".getBytes());
			out.flush();
			out.close();
//			fis.close();
			socket.close();
			System.out.println(System.currentTimeMillis()-start);
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		
	}

}
