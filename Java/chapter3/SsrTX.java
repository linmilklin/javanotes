import java.util.*;
public class SsrTX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("1������");
		System.out.println("2��ֱ��������");
		System.out.println("3������������");
		System.out.println("4������");
		System.out.println("5������");
		System.out.println("-------------------");
		System.out.print("��ѡ��Ҫ��ӡ��ͼ�Σ�");
		int i = sc.nextInt();
		for(;i == 1;){
			System.out.print("��������εĸߣ�");
			int jg = sc.nextInt();
			System.out.print("��������εĿ�");
			int jk = sc.nextInt();
			for(;jg >= 1;jg-- ){
				System.out.println(" ");
					
				for(int jk2=jk;jk2 >= 1;jk2--){
					System.out.print("* ");
					
				}
			}
			break;
		}
		
		for(;i == 2;){
			System.out.println("�����������εĸߣ�");
			int sg = sc.nextInt();
			
			for(;sg >= 1;sg--){
				System.out.println(" ");
				for(int sg2 = 1;sg2 <= sg;){
					sg++;
					System.out.print("* ");
				}
			
			}
			
			break;	
		}
		
    }
}
