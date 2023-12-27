import java.util.*;
public class Guess{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int ran = new Random().nextInt(10);		//随机生成0到10一个随机数
			
			System.out.println("输入随机数");
		
		
		for(int n = 1;n<=3;n++){
			int shu = sc.nextInt();
		
			if(shu < ran){
				System.out.println("太小");
			}else if(shu > ran){
				System.out.println("太大");
			}else{
				System.out.println("刚刚好");
				break;
			}
		
		
		}
		
	}
}