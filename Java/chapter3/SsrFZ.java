import java.util.*;
public class SsrFZ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//����״һ����
		for(int a = 1;a <=9 ; a++){
			System.out.println(" ");
			for(int b = 1;b <= a;b++){
				System.out.print(b+" ");
			}
		}
		
		//�žų˷���
		for(int c = 1;c <= 9; c++){
			System.out.println(" ");
			for(int f = 1;f <= c;f++){
				System.out.print(c+"*"+f+"="+(c*f)+";");
			}
		}
		
		//����
		for(int a = 1;a <=9 ; a++){
			System.out.println(" ");
			for(int b = 9;b >= a;b--){
				System.out.print("* ");
			}
		}
		
		//����
		for(int a = 1;a <=9 ; a++){
			System.out.println(" ");
			for(int c = 1;c <= 9-a;c++){
				System.out.print(" ");
			}
			for(int b = 1;b <= a;b++){
				System.out.print("*");
			}
		}
		
		//������
		for(int a = 1;a <=9 ; a++){
			System.out.println(" ");
			for(int c = 1;c <= 9-a;c++){
				System.out.print(" ");
			}
			for(int b = 1;b <= a;b++){
				System.out.print("* ");
			}
		}
		
		
	}
}