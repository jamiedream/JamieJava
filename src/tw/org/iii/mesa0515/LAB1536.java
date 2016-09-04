package tw.org.iii.mesa0515;

import java.io.File;
import java.io.IOException;

public class LAB1536 {

	public static void main(String[] args) {
		File file1 = new File("c:/king/file1");
		//路徑可以\\或/
		//建立file1
		if(file1.isFile()){
			System.out.println("OK");
		}else{
			try{
				if(file1.createNewFile()){
					System.out.println("Create OK");
				}else{
					System.out.println("Create Fail");
				}				
			}catch(IOException ie){
				//IOException需獨立宣告相關函式
				System.out.println("Fail");
			}
		}
		
		File file2 = new File("c:/test/dire/dire2/dire3");
		if(!(file2.isDirectory())){
			//若file2不存在則建立
			file2.mkdir();
			//建立dire2為目標資料夾,mkdir"s";若建立一個資料夾則不需s
		}
		
		
		
	}

}
