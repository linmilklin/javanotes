import java.util.*;
public class Guess{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int ran = new Random().nextInt(10);		//�������0��10һ�������
			
			System.out.println("���������");
		
		
		for(int n = 1;n<=3;n++){
			int shu = sc.nextInt();
		
			if(shu < ran){
				System.out.println("̫С");
			}else if(shu > ran){
				System.out.println("̫��");
			}else{
				System.out.println("�ոպ�");
				break;
			}
		
		
		}
		
	}
}