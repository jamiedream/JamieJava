package tw.org.iii.mesa0515;

public class LAB1525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = new String();
		byte[] b1 = {97,98,99,100};
		String a2 = new String(b1);
		String a3 = new String(b1,1,2);
		Bike b2 = new Bike();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(b2);
	}

}
