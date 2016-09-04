package hw;

public class 正向交換數列 {

	public static void main(String[] args) {
		
		int []array = new int[5];
		
		for(int i=0; i<array.length; i++){
			array[i] = i;
			//列出array有的數列
		}
		for(int j=0; j<(array.length); j++){
			//交換次數為長度
			int toSwitch = (int)(Math.random()*(array.length-j)+j);
			//交換位置,j=0->j:0~(length-1);j=1->j:1~(length-1)....

			System.out.println(j + "<->" + toSwitch);
			System.out.println("---");
			//列出交換過程
			
			int space = array[j];
			array[j] = array[toSwitch];
			array[toSwitch] = space;
			
		}
		for(int j=0; j<array.length; j++){
			System.out.print(array[j] + "  ");
			//輸出交換結果
		}
		
			
		}

		

		
//		for(int j=0; j<(array.length-1);j++){
//			for(int i=5; i>=0; i--){
//			//隨機產生0-n要交換的亂數,最後一個開始往前交換,交換n-1次
//			int toSwitch = (int)(Math.random()*(5-j));
//			
//			array[i] = i;
//			System.out.print(array[i]);
//		}
//
//		}
			
	
		
}		


