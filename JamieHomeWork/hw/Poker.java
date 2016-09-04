package hw;

public class Poker {

	public static void main(String[] args) {
		int []array = new int[52];
		
		for(int i=0; i<array.length; i++){
			array[i] = i+1;
			//列出array有的數列1~52
//			System.out.println(array[i]);
		}
		for(int j=0; j<array.length; j++){
			//交換次數為長度
			int toSwitch = (int)(Math.random()*(array.length-j));
//			System.out.println(toSwitch);
			//交換位置,j=0->j:0~(length-1);j=1->j:0....

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

}
