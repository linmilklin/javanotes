import java.util.*;
public class SsrFZYF{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份");
		int yf = sc.nextInt();
		switch( yf ){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31天");
				break;
			case 2:
				System.out.println("28天");
				break;
			default:
				System.out.println("30天");
				break;
		}		
			
		if( yf == 1 || yf == 3 || yf ==5 || yf == 7 || yf == 8 || yf == 10 || yf == 12 ){
			System.out.println("31天");
		}else if( yf == 2){
			System.out.println("28天");
		}else{
			System.out.println("30天");
		}
		
	}
}
