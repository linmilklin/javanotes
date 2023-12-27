import java.util.*;
public class FenZhitwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入小写数字");
		int s = sc.nextInt();
		
		//if可以做 > < 的输出
		if( s == 0){		
			System.out.println("零");
		}else if( s == 1){
			System.out.println("壹");
		}else if( s == 2){
			System.out.println("贰");
		}else if( s == 3){
			System.out.println("叁");
		}else if( s == 4){
			System.out.println("肆");
		}else if( s == 5){
			System.out.println("伍");
		}else if( s == 6){
			System.out.println("陆");
		}else if( s == 7){
			System.out.println("柒");
		}else if( s == 8){
			System.out.println("捌");
		}else if( s == 9){
			System.out.println("玖");
		}else if( s == 10){
			System.out.println("拾");
		}else{
			System.out.println("请重新输入");
		}
		
		//switch只能做等于输出,及等值
		switch( s ){	
			case 0:
				System.out.println("零");
				break;
			case 1:
				System.out.println("壹");
				break;
			case 2:
				System.out.println("贰");
				break;
			case 3:
				System.out.println("叁");
				break;
			case 4:
				System.out.println("肆");
				break;
			case 5:
				System.out.println("伍");
				break;
			case 6:
				System.out.println("陆");
				break;
			case 7:
				System.out.println("柒");
				break;
			case 8:
				System.out.println("捌");
				break;
			case 9:
				System.out.println("玖");
				break;
			case 10:
				System.out.println("拾");
				break;
			default:
			System.out.println("玖");
			break;
		}
		
	}
		
}