import java.util.*;
public class SsrFZYF{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·�");
		int yf = sc.nextInt();
		switch( yf ){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31��");
				break;
			case 2:
				System.out.println("28��");
				break;
			default:
				System.out.println("30��");
				break;
		}		
			
		if( yf == 1 || yf == 3 || yf ==5 || yf == 7 || yf == 8 || yf == 10 || yf == 12 ){
			System.out.println("31��");
		}else if( yf == 2){
			System.out.println("28��");
		}else{
			System.out.println("30��");
		}
		
	}
}
