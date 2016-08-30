package tw.org.iii.mesa0515;

public class Pocker {

	public static void main(String[] args) {
		
		int[] poker = new int[52];
		for(int i=0; i<poker.length; i++){
			int temp = (int)(Math.random()*52);
			//check
			
			
			boolean isRepeat = false;
			for(int j=0; j<i; j++){
				if( temp == poker[j]){
					isRepeat = true;
					break;
				}
			}
				if(isRepeat){
					i--;
					continue;
				}
				System.out.println(temp);
				poker[i]=temp;
			
			
		}

	}

}
