package tw.org.iii.mesa0515;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.concurrent.BrokenBarrierException;

import org.omg.CosNaming.IstringHelper;

public class LAB1540 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = 
					new FileInputStream("dir1/Book1.csv");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			//可直接用filereader讀取,但在網際網路無法用filereader
//			String line = br.readLine(); //讀出br的行
//			System.out.println(line);
			String line;
			while((line = br.readLine()) != null){
				//當br的行不為null時回傳
				String[] row = line.split(",");
				//檔案遇到","時分開字串
				System.out.println("Name:"+row[0]+
						" Tel:"+row[1]+
						" Add:"+row[2]);
				
			}
			
			
			isr.close();
			//close fis.isr.br都可
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
