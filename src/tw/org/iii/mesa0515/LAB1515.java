package tw.org.iii.mesa0515;

public class LAB1515 {

	public static void main(String[] args) {
		lab:
		//�bfor�j��e�[�J�@�Ӽ���"lab",break lab�|����������Ӽ��Ҥ���for�j��
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
