import java.util.*;
public class SsrRN{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������λ�����");
		int nl = sc.nextInt();
		boolean a = nl % 400 == 0 || (nl % 4 == 0 && nl % 100 != 0);
		boolean b = nl % 4 == 0 && nl % 100 != 0;
		
		
		if(nl % 400 == 0 || (nl % 4 == 0 && nl % 100 != 0)){
			System.out.println("����");
		}else{
			System.out.println("ƽ��");
		}
		
	}
}
