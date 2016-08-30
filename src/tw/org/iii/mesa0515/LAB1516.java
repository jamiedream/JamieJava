package tw.org.iii.mesa0515;

public class LAB1516 {

	public static void main(String[] args) {
		

		for(int i = 1; i<=100; i++){
			boolean isP = true;
			for(int j = 2; j<=i/2; j++){
				if(i%j == 0)
				isP = false;
			}
			System.out.print(i + (isP?"*":" ") + " ");
			if(i%10 == 0)System.out.println();
			
		  }
		

	}

}
