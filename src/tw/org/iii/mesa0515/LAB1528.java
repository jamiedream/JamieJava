package tw.org.iii.mesa0515;

import javax.swing.JOptionPane;

public class LAB1528 {
//猜數字
	public static void main(String[] args) {
		// 1.Answer
		String answer = getAnswer(4);
		System.out.println(answer);
		// 2.Start
		boolean isWinner = false;
		for(int i=0; i<4; i++){
		// 3.Guess
			String guess = JOptionPane.showInputDialog("Input");
			
		// 4.Check ?A?B
			if(guess.equals(answer)){
				isWinner = true;
				break;
			}
			String result = getResult(answer, guess);
			JOptionPane.showMessageDialog(null, result + " : " + guess);
		}
		// 5.Winner
		if(isWinner){
			JOptionPane.showMessageDialog(null, "恭喜破關");
		}else{
			JOptionPane.showMessageDialog(null, "再試一次:" + answer);
		}
		
		
		
	}
	static String getAnswer(int n){
		int[] poker = new int[n];
		for(int i=0; i<poker.length; i++){
			int temp;
			//check 
			boolean isRepeat;
			do{
				temp = (int)(Math.random()*10);
				isRepeat = false;
			for(int j=0; j<i; j++){
				if( temp == poker[j]){
					isRepeat = true;
					break;
				}
			}
			}while(isRepeat);
			poker[i] = temp;
		}
		String ret = "";
		for(int p:poker)ret += p;
		return ret;
		
//		// poker[0] poker[1] poker[2] poker[3]
//		return "" + poker[0] + poker[1] + poker[2] + poker[3];
		
	}
	static String getResult(String a, String g){
		int A, B;
		A = B = 0;
		for(int i=0; i<g.length(); i++){
			if(g.charAt(i) == a.charAt(i)){
				A++;
			}else if(a.indexOf(g.charAt(i)) != -1){
				B++;
			}
			
		}
		return A + "A" + B + "B";
	}
	
}
