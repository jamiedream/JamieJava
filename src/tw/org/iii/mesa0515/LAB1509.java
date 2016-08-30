package tw.org.iii.mesa0515;

public class LAB1509 {

	public static void main(String[] args) {
		int year = 2016;
		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 == 0){
				System.out.println(29);	
				}else{
					System.out.println(28);	
				}
			}else{
				System.out.println(28);	
			}
			

		}else{
			System.out.println(28);		
		}
	}

}
