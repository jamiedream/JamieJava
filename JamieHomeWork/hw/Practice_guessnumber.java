package hw;

import javax.swing.JOptionPane;

public class Practice_guessnumber {

	public static void main(String[] args) {
		//generate random answer string
		String answer = theAnswer(4);
		System.out.println(answer);
		 
		for(int i=0; i<4; i++){	
			//guess
			String guess = JOptionPane.showInputDialog("Input");

			
			//check A B	
			String result = checkAB(answer, guess);
//			result = JOptionPane.showMessageDialog(null, "");
		}

		
		//result
	
	
}

static String theAnswer(int n){
	int []array = new int[10];
	
	for(int i=0; i<array.length; i++){
		array[i] = i;
		//列出array有的數列
	}
	for(int j=0; j<(array.length); j++){
		//交換次數為長度-1
		int toSwitch = (int)(Math.random()*(array.length-j)+j);
		//交換位置,j=0->j:0~(length-1);j=1->j:1~(length-1)....

//		System.out.println(j + "<->" + toSwitch);
//		System.out.println("---");
//		//列出交換過程
		
		int space = array[j];
		array[j] = array[toSwitch];
		array[toSwitch] = space;
		
	}
//	for(int j=0; j<array.length; j++){
//		System.out.print(array[j] + "  ");
//		//輸出交換結果
//	}
	String output = "";
	for(int k=0; k<n ; k++){
		output +=array[k];
	}
	//	做出一個空字串,將theAnswer指定的亂數長度列出成這個空字串
	
	return output;
}

static String checkAB(String a, String g){
	
	int A,B; A = B = 0;
	
	for(int i=0; i<a.length(); i++){
	if(a.charAt(i) == g.charAt(i)){
		//若g字串在i的位置的數值相等於a字串在i的數值
		A++;
	}else if((a.indexOf(g.charAt(i))) != -1){
		//若在g字串中找到a字串的數,傳回值不為false
		B++;
	}
	}
	
	return A+"A"+B+"B";
}
}
