package tw.org.iii.mesa0515;

import java.net.InetAddress;
import java.net.UnknownHostException;
//get ip
public class LAB1550 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.hinet.net");
			//查不到網址或寫錯ip才會跑例外(ex. >255)
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("UnknownHost");
		}

	}

}
