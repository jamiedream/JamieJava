package tw.org.iii.mesa0515;

public class LAB1515 {

	public static void main(String[] args) {
		lab:
		//在for迴圈前加入一個標籤"lab",break lab會直接結束整個標籤中的for迴圈
		for(int j=0; j<5; j++){
		for(int i=0; i<10; i++){
			System.out.println(i + "." + j);
			if(i==3){
				break lab;
			}
		}
		
		}
	}

}
