import java.util.*;
public class XunHuanWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//whileѭ��Ϊtrueʱ����ѭ��
		int i = 0;
		while(i <=11){
			System.out.println("N");
			i=i+3;
			
		}
		System.out.println(i);
		
		//	whileѭ��
		int x = 1;
		while(x <= 9){
			System.out.println("* ");
			x++;
			int o = 1;
			while(o < x ){
				System.out.print("* ");
				o++;
			}
		}
		
		//	do{}whileѭ��	��ִ�к��ж�
		int a = 1;
		int b = 0;
		int c = 1000;
		do{
			b=b+a;
			a=a+1;
			
		}while(a <= c);
		System.out.println("1~1000��Ϊ��"+b);

	}
}