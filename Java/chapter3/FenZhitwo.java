import java.util.*;
public class FenZhitwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����Сд����");
		int s = sc.nextInt();
		
		//if������ > < �����
		if( s == 0){		
			System.out.println("��");
		}else if( s == 1){
			System.out.println("Ҽ");
		}else if( s == 2){
			System.out.println("��");
		}else if( s == 3){
			System.out.println("��");
		}else if( s == 4){
			System.out.println("��");
		}else if( s == 5){
			System.out.println("��");
		}else if( s == 6){
			System.out.println("½");
		}else if( s == 7){
			System.out.println("��");
		}else if( s == 8){
			System.out.println("��");
		}else if( s == 9){
			System.out.println("��");
		}else if( s == 10){
			System.out.println("ʰ");
		}else{
			System.out.println("����������");
		}
		
		//switchֻ�����������,����ֵ
		switch( s ){	
			case 0:
				System.out.println("��");
				break;
			case 1:
				System.out.println("Ҽ");
				break;
			case 2:
				System.out.println("��");
				break;
			case 3:
				System.out.println("��");
				break;
			case 4:
				System.out.println("��");
				break;
			case 5:
				System.out.println("��");
				break;
			case 6:
				System.out.println("½");
				break;
			case 7:
				System.out.println("��");
				break;
			case 8:
				System.out.println("��");
				break;
			case 9:
				System.out.println("��");
				break;
			case 10:
				System.out.println("ʰ");
				break;
			default:
			System.out.println("��");
			break;
		}
		
	}
		
}