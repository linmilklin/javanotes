import java.util.*;
public class XunHuan{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//��ѭ��
		/*
		
		for(;;){
			System.out.println("����");
		}
		
		*/
		//forѭ��
		/*for(���ʽ1;���ʽ2;���ʽ3){
			ѭ���Ĵ���
		}

			���ʽ1	Ϊѭ����ʼֵ
			���ʽ2 Ϊѭ�����������ж��Ƿ�ѭ��
			���ʽ3 Ϊѭ��һ�θı��ֵ
		*/
		
		for(int i = 0;i < 5;i++ ){
			System.out.println("��");
			
		}
		
		for(int s = 11 ; s < 21 ; s++){
			System.out.print(s-10);		//printû��lnʱ������
	
		}
		for(int s = 11 ; s < 21 ; s++){
			System.out.println(s-10);
	
		}
		
		for(int x = 1 ; x <= 4 ; x++){
			System.out.println("# # # # #");
			for(int x2 = 1 ; x2 <= 4 ; x2++){		//˫��forѭ��
				System.out.println("* * * * *");
				for(int x3 = 1 ; x3 <= 4 ; x3++){		//����
					System.out.println("% % % % %");
				
				}
			}
		}
		
		for(int a = 1;a < 5;a++){
			System.out.println(" ");	//��ӡ ���ַ���+ln �������е�Ч��
			for(int b = 1;b < 5;b++){
				System.out.print("* ");
			}
		}
		
		System.out.println("����һ����n�����n*n��ͼ��");
		int n = sc.nextInt();
		
		for(int a=1 ;a<n+1 ;a++){
			System.out.print(n);
			
			for(int b=0 ;b<n ;b++){
				System.out.print("");
			}
		}
			
		
	}
}