package tw.org.iii.mesa0515;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LAB1554 {

	public static void main(String[] args) {
		
		try {
			ServerSocket sever = new ServerSocket(8000);
			Socket socket = sever.accept();
			
			FileOutputStream fout = new FileOutputStream("upload/Jamie.jpg");
			InputStream in = socket.getInputStream();
			int c;
			while((c = in.read()) !=-1){
				fout.write(c);
//				System.out.print((char)c);
			}
			
			in.close();
			sever.close();
			socket.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
