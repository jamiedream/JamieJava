package hw;

public class example {

	public static void main(String[] args) {
		  int[] poker = new int[52];
		  //initialize ordered poker number, from 1 to 52.
		  for (int i = 0; i < poker.length; i++) {
		   poker[i]=i+1;
		  }
		  
		  for (int i = 0; i < (poker.length-1); i++) {
		   int indexToSwitch = ((int)(Math.random() * (51-i)))+i;
		 
		   {
		    int switchTemp = poker[i];
		    poker[i] = poker [indexToSwitch];
		    poker[indexToSwitch] = switchTemp;
		    System.out.println(poker[i]);

		   }
		   
		  }
		  for (int i = 0; i < poker.length; i++) {
		   System.out.print(poker[i] + " ");
		  }
		  }
}
